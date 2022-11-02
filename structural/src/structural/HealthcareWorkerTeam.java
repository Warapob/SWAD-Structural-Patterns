package structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{

    private Set<HealthcareServiceable> members = new LinkedHashSet<HealthcareServiceable>();
    void addMember(HealthcareServiceable member){
        members.add(member);
    }

    void removeMember(HealthcareServiceable   name){
        members.remove(name);
    }
    @Override
    public void service() {
        for(HealthcareServiceable member : members){
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable member : members) {
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }

}
