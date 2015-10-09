package library.interfaces.entities;

import java.util.Date;

public interface ILoan {
	
	public static final int LOAN_PERIOD = 14;
	
	
	public void commit(int id);
	
	public void complete();
    
    public boolean isCurrent();
	
	public boolean isOverDue();
	
	public boolean checkOverDue(Date currentDate);
	
	public IMember getBorrower();
	
	public void setBook(IBook book);
	
	public IBook getBook();
	
	public int getID();
	

}
