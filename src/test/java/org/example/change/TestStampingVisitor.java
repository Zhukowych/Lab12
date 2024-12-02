package org.example.change;

import org.example.visitor.Signature;
import org.example.visitor.StampingVisitor;
import org.example.visitor.Task;
import org.junit.Assert;
import org.junit.Test;

public class TestStampingVisitor {

    @Test
    public void testVisit() {
        String groupUUID = "test-group-uuid";
        StampingVisitor stampingAPI = new StampingVisitor(groupUUID);
        Task<String> task = new Signature<>(s -> {});

        stampingAPI.visitTask(task);

        Assert.assertEquals(groupUUID, task.getHeader("groupUUID"));
    }


}
