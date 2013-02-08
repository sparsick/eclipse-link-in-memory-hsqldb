package com.github.skosmalla.eclipse.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.github.skosmalla.eclipse.persistence.entity.EntityA;


public class EclipseLinkExample {

    private static EntityManager entityManager = Persistence.createEntityManagerFactory("example")
            .createEntityManager();


    public EntityA saveEntityA(EntityA anEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(anEntity);
        entityManager.getTransaction().commit();

        return anEntity;
    }


    public EntityA findEntityA(Long id) {
        entityManager.getTransaction().begin();
        EntityA entityA = entityManager.find(EntityA.class, id);
        entityManager.getTransaction().commit();
        return entityA;
    }

}
