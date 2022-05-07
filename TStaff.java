/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssm_sw;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "t_staff", catalog = "s_m_s", schema = "")
@NamedQueries({
    @NamedQuery(name = "TStaff.findAll", query = "SELECT t FROM TStaff t")
    , @NamedQuery(name = "TStaff.findByTeacherid", query = "SELECT t FROM TStaff t WHERE t.teacherid = :teacherid")
    , @NamedQuery(name = "TStaff.findByName", query = "SELECT t FROM TStaff t WHERE t.name = :name")
    , @NamedQuery(name = "TStaff.findByAge", query = "SELECT t FROM TStaff t WHERE t.age = :age")
    , @NamedQuery(name = "TStaff.findByGraduate", query = "SELECT t FROM TStaff t WHERE t.graduate = :graduate")
    , @NamedQuery(name = "TStaff.findByPGraduate", query = "SELECT t FROM TStaff t WHERE t.pGraduate = :pGraduate")
    , @NamedQuery(name = "TStaff.findByAadhaarno", query = "SELECT t FROM TStaff t WHERE t.aadhaarno = :aadhaarno")
    , @NamedQuery(name = "TStaff.findByB", query = "SELECT t FROM TStaff t WHERE t.b = :b")
    , @NamedQuery(name = "TStaff.findByJ", query = "SELECT t FROM TStaff t WHERE t.j = :j")
    , @NamedQuery(name = "TStaff.findByExprience", query = "SELECT t FROM TStaff t WHERE t.exprience = :exprience")
    , @NamedQuery(name = "TStaff.findByLeave", query = "SELECT t FROM TStaff t WHERE t.leave = :leave")
    , @NamedQuery(name = "TStaff.findBySalary", query = "SELECT t FROM TStaff t WHERE t.salary = :salary")
    , @NamedQuery(name = "TStaff.findByContactNO", query = "SELECT t FROM TStaff t WHERE t.contactNO = :contactNO")})
public class TStaff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Teacher_id")
    private Integer teacherid;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Age")
    private int age;
    @Column(name = "Graduate")
    private String graduate;
    @Column(name = "P_Graduate")
    private String pGraduate;
    @Basic(optional = false)
    @Column(name = "Aadhaar_no")
    private long aadhaarno;
    @Basic(optional = false)
    @Column(name = "B")
    private String b;
    @Basic(optional = false)
    @Column(name = "J")
    private String j;
    @Column(name = "Exprience")
    private Integer exprience;
    @Column(name = "Leave")
    private Integer leave;
    @Basic(optional = false)
    @Column(name = "Salary")
    private int salary;
    @Basic(optional = false)
    @Column(name = "Contact_NO")
    private long contactNO;

    public TStaff() {
    }

    public TStaff(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public TStaff(Integer teacherid, String name, int age, long aadhaarno, String b, String j, int salary, long contactNO) {
        this.teacherid = teacherid;
        this.name = name;
        this.age = age;
        this.aadhaarno = aadhaarno;
        this.b = b;
        this.j = j;
        this.salary = salary;
        this.contactNO = contactNO;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        Integer oldTeacherid = this.teacherid;
        this.teacherid = teacherid;
        changeSupport.firePropertyChange("teacherid", oldTeacherid, teacherid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        String oldGraduate = this.graduate;
        this.graduate = graduate;
        changeSupport.firePropertyChange("graduate", oldGraduate, graduate);
    }

    public String getPGraduate() {
        return pGraduate;
    }

    public void setPGraduate(String pGraduate) {
        String oldPGraduate = this.pGraduate;
        this.pGraduate = pGraduate;
        changeSupport.firePropertyChange("PGraduate", oldPGraduate, pGraduate);
    }

    public long getAadhaarno() {
        return aadhaarno;
    }

    public void setAadhaarno(long aadhaarno) {
        long oldAadhaarno = this.aadhaarno;
        this.aadhaarno = aadhaarno;
        changeSupport.firePropertyChange("aadhaarno", oldAadhaarno, aadhaarno);
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        String oldB = this.b;
        this.b = b;
        changeSupport.firePropertyChange("b", oldB, b);
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        String oldJ = this.j;
        this.j = j;
        changeSupport.firePropertyChange("j", oldJ, j);
    }

    public Integer getExprience() {
        return exprience;
    }

    public void setExprience(Integer exprience) {
        Integer oldExprience = this.exprience;
        this.exprience = exprience;
        changeSupport.firePropertyChange("exprience", oldExprience, exprience);
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        Integer oldLeave = this.leave;
        this.leave = leave;
        changeSupport.firePropertyChange("leave", oldLeave, leave);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        int oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public long getContactNO() {
        return contactNO;
    }

    public void setContactNO(long contactNO) {
        long oldContactNO = this.contactNO;
        this.contactNO = contactNO;
        changeSupport.firePropertyChange("contactNO", oldContactNO, contactNO);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherid != null ? teacherid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TStaff)) {
            return false;
        }
        TStaff other = (TStaff) object;
        if ((this.teacherid == null && other.teacherid != null) || (this.teacherid != null && !this.teacherid.equals(other.teacherid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ssm_sw.TStaff[ teacherid=" + teacherid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
