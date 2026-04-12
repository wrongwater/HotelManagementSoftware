public class guest
{
    String name;
    String surname;
    String id;
    String nationality;
    int dateofbirth;
    String creditcardinfo;
    String roomtype;
    String emailaddress;
    String servicetype;

        public Guest(String name, String surname, String id, String nationality, int dateofbirth, String creditcardinfo,
                     String roomtype, String emailaddress, String servicetype)
        {
            this.name=name;
            this.surname=surname;
            this.id=id;
            this.nationality=nationality;
            this.dateofbirth=dateofbirth;
            this.creditcardinfo=creditcardinfo;
            this.roomtype=roomtype;
            this.emailaddress=emailaddress;
            this.servicetype=servicetype;
        }
}