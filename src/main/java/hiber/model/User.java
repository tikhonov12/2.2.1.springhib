package hiber.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "Name")
   private String firstName;

   @Column(name = "Last_name")
   private String lastName;

   @Column(name = "Email")
   private String email;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinTable(name = "cars")
   private Car car;

   public User() {
   }
   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }



   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setCar(Car car) {
      this.car = car;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getEmail() {
      return email;
   }

   public Car getCar() {
      return car;
   }

   public Long getId() {
      return id;
   }
}

