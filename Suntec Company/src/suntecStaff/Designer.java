package suntecStaff;
public class Designer extends Employee {
		private Double bonus;
		private Double salary;
		private Double payPerHourJunior;
		private Double payPerHourSenior;
		private Double payPerHourConsultant;
		private Double bachlorAllowance;
		private Double masterAllowance;
			
		public Designer(String firstName,String lastName,int id,Gender gender,String designation){
			super(firstName,lastName,id,gender,designation);
			}
		
		public Double  getSalary(){
			return this.salary;
		}
		public Double  getBonus(){
			return this.bonus;
			}
		public void setPayPerHourJounior(Double payPerHourjunior ){
			this.payPerHourJunior = payPerHourJunior;
		}
		public Double getPayPerHourJounior(){
			return payPerHourJunior;
		}
		
		public void setPayPerHourSenior(Double payPerHourSenior){
			this.payPerHourSenior = payPerHourSenior;
		}
		
		public Double  getPayPerHourSenior(){
			return payPerHourSenior;
		}
		
		public void  setPayPerHourConsultant(Double payPerHourConsultant){
			this.payPerHourConsultant= payPerHourConsultant;
		}
		
		public Double  getPayPerHourConsultant(){
			return payPerHourConsultant;
		}
		
		public Double getBachlorAllowance(){
			return bachlorAllowance;
		}
		
		public Double getMasterAllowance(){
			return masterAllowance;
		}
		
		public void setBachlorAllowance(Double juniorAllowance){
			this.bachlorAllowance= juniorAllowance;
		}
		
		public void setMasterAllowance(Double seniorAllowance){
			this.masterAllowance= seniorAllowance;
		}
		

		public Double salary(int experience,int numberOfWorkingHours,String qualification) {
			Double  basicSalary;
			switch(qualification){
			
			case "BCS":
				if ((experience>0)&&(experience>5)){
					basicSalary = numberOfWorkingHours*(getPayPerHourJounior());
					this.salary = basicSalary + (getBachlorAllowance());
				}
					else if((experience>= 5) && (experience<10)){
						basicSalary = numberOfWorkingHours*(getPayPerHourSenior());
						this.salary = basicSalary + getBachlorAllowance();
					}
					 break;
			case "MSc":
				if ((experience>0)&&(experience>5)){
					basicSalary = numberOfWorkingHours*(getPayPerHourSenior());
					this.salary = basicSalary + (getBachlorAllowance());
				}
					else if((experience>= 5) && (experience<10)){
						basicSalary = numberOfWorkingHours*(getPayPerHourSenior());
						this.salary = basicSalary + (getMasterAllowance());	
					}
				
				break;
				
			case "PhD": {
				this.salary = numberOfWorkingHours*(getPayPerHourConsultant());
			}
			break;
			
			case "None": if((experience !=0)&& (experience>10)){
					this.salary = numberOfWorkingHours*(getPayPerHourConsultant());
			}
				
				} 
			return salary;
		}
		

		public Double bonus(){
			this.bonus = (getSalary())*20/100;
			return bonus;
		}
			}
			

			
		




