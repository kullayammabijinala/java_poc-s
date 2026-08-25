package project2;

public class Patient {
	 String PatientName;
	 int Age;
	 double RoomChargePerDay;
	 int NumberofDaysAdmitted;
	 
	 Patient( String PatientName, int Age, double RoomChargePerDay,int NumberofDaysAdmitted){
		 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void display () {
		 double TotalHospitalBill = RoomChargePerDay * NumberofDaysAdmitted;
	}
}
