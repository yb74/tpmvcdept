package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeptPair  {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;        
  private String deptNum;
  private String  deptName;

  public DeptPair(String deptNum, String deptName) {
    this.deptNum = deptNum;
    this.deptName = deptName;
  }
  
  public String getDeptNum() {
    return deptNum;
  }

  public String getDeptName() {
    return deptName;
  }

@Override
public String toString() {
	return "DeptPair [deptNum=" + deptNum + ", deptName=" + deptName + "]";
}
  
  
}
