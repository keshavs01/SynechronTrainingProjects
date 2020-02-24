package com.example.demo.daos;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Payment;
import com.example.demo.entity.Tour;
import com.example.demo.ifaces.Dao;

import lombok.Setter;

@Repository
@Setter
public class TourDao implements Dao<Tour> {

	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Map<String, Object>> findAll() {
		String sql = "select * from tour";
		return this.template.queryForList(sql);
	}

	@Override
	public long add(Tour t) {
		String sql = "insert into tour values(?,?,?,?)";
		return this.template.update(sql,
				new Object[] { t.getTourId(), t.getTourName(), t.getDuration(), t.getPrice() });
	}

	@Override
	public long remove(Tour r) {
		String sql = "delete from tour where tourid = ?";
		return this.template.update(sql, new Object[] { r.getTourId() });
	}

	@Override
	public long update(Tour t) {
		String sql = "update tour set tourname = ?, duration = ?, price = ? where tourid = ? ";
		return this.template.update(sql,
				new Object[] { t.getTourName(), t.getDuration(), t.getPrice(), t.getTourId() });
	}
	
	@Override
	public long addPayment(Payment pymnt) {
		String sql = "insert into paymentdata set customerid = ?, paymentmode = ?,amount = ?,paymentdate = ?";
		return this.template.update(sql,
				new Object[] { pymnt.getCustomerId(), pymnt.getPaymentMode(), pymnt.getAmount(), pymnt.getPaymentDate()});
	}

}
