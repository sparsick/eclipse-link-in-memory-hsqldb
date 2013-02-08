package com.github.skosmalla.eclipse.persistence;

import static org.junit.Assert.*;

import java.sql.SQLException;

import com.github.skosmalla.eclipse.persistence.entity.EntityA;
import org.junit.Test;

public class EclipseLinkLoggingExampleTest {



    @Test
    public void saveEntityTest() throws SQLException {
        EclipseLinkExample example = new EclipseLinkExample();

        EntityA anEntity = new EntityA("a", "b");
        example.saveEntityA(anEntity);

        EntityA findEntityA = example.findEntityA(anEntity.getId());

        assertEquals(anEntity, findEntityA);
    }

}
