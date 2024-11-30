package org.example.visitor;

public class StampingVisitor implements Visitor{

    private String groupUUID;

    public StampingVisitor(String groupUUID) {
        this.groupUUID = groupUUID;
    }

    @Override
    public void visitTask(Task<?> task) {
        task.setHeader("groupUUID", groupUUID);
    }

}
