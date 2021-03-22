package edu.isu.cs2263.HW4;

import java.util.List;

public class RelationshipVisitor implements Visitor {

    public RelationshipVisitor() {}

    @Override
    public String visit(Person per1) {
        System.out.println("Relationships of " + per1.name() + ":");
        List<Relationship> rel = per1.relationshipList;
        String output = "";
        for(int i = 0; i < rel.size(); i++) {
            output += per1.name() + " is " + rel.get(i).relation + " " + rel.get(i).person.name() + "\n";
        }
        return output;
    }
}
