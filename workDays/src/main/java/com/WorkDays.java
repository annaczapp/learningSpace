package com;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class WorkDays
{
	public static void main(String[] args)
	{
		System.out.print(countWorkDays(LocalDate.of(2012, 2, 1), LocalDate.of(2012, 5, 1)));
	}

	static long countWorkDays(final LocalDate start, final LocalDate end)
	{
		int workDays = 0;

		//create calendars
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(Date.from(start.atStartOfDay(ZoneId.systemDefault()).toInstant())); //convert LocalDate to Date

		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(Date.from(end.atStartOfDay(ZoneId.systemDefault()).toInstant())); //convert LocalDate to Date

		do
		{
			startCalendar.add(Calendar.DAY_OF_MONTH, 1);
			if (!(startCalendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || startCalendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY))
			{
				workDays++;
			}
		}
		while (startCalendar.getTimeInMillis() <= endCalendar.getTimeInMillis());

		return workDays;

	}


}
