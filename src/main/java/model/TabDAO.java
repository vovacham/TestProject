package model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import services.HibernateSessionFactory;

public class TabDAO {

    /**
     * Добавление (замена) элемента в базу
     */
    public static void addToBase(TabEntity tabEntity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(tabEntity);
        transaction.commit();
        session.close();
    }

    /**
     * Получение элемента из базы
     */
    public static TabEntity getFromBase(int mesId) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        TabEntity tabEntity = session.get(TabEntity.class, mesId);
        session.close();
        return tabEntity;
    }

    /**
     * Удаление элемента из базы
     */
    public static void removeFromBase(int mesId) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        TabEntity tabEntity = session.get(TabEntity.class, mesId);
        session.delete(tabEntity);
        transaction.commit();
        session.close();
    }
}
