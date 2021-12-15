package com.Sys;

public class Mv3project {
	private int movie_id;
	private int theatre_id;
	private int  MT_id;
	private int  active;
	private String movie_timing;
	private String movie_date;
	@Override
	public String toString() {
		return "Mv3project [movie_id=" + movie_id + ", theatre_id=" + theatre_id + ", MT_id=" + MT_id + ", active="
				+ active + ", movie_timing=" + movie_timing + ", movie_date=" + movie_date + "]";
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public int getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}
	public int getMT_id() {
		return MT_id;
	}
	public void setMT_id(int mT_id) {
		MT_id = mT_id;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getMovie_timing() {
		return movie_timing;
	}
	public void setMovie_timing(String movie_timing) {
		this.movie_timing = movie_timing;
	}
	public String getMovie_date() {
		return movie_date;
	}
	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}
	public Mv3project(int movie_id, int theatre_id, int mT_id, int active, String movie_timing, String movie_date) {
		super();
		this.movie_id = movie_id;
		this.theatre_id = theatre_id;
		MT_id = mT_id;
		this.active = active;
		this.movie_timing = movie_timing;
		this.movie_date = movie_date;
	}
	public Mv3project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
