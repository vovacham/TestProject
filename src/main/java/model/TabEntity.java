package model;

import javax.persistence.*;

@Entity
@Table(name = "tab", schema = "public", catalog = "test")
public class TabEntity {
    private int id;
    private String mesType;
    private String mes1;
    private String mes2;

    public TabEntity(int id, String mesType, String mes1, String mes2) {
        this.id = id;
        this.mesType = mesType;
        this.mes1 = mes1;
        this.mes2 = mes2;
    }

    public TabEntity() {
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mestype", nullable = true, length = -1)
    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mestype) {
        this.mesType = mestype;
    }

    @Basic
    @Column(name = "mes1", nullable = true, length = -1)
    public String getMes1() {
        return mes1;
    }

    public void setMes1(String mes1) {
        this.mes1 = mes1;
    }

    @Basic
    @Column(name = "mes2", nullable = true, length = -1)
    public String getMes2() {
        return mes2;
    }

    public void setMes2(String mes2) {
        this.mes2 = mes2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabEntity tabEntity = (TabEntity) o;

        if (id != tabEntity.id) return false;
        if (mesType != null ? !mesType.equals(tabEntity.mesType) : tabEntity.mesType != null) return false;
        if (mes1 != null ? !mes1.equals(tabEntity.mes1) : tabEntity.mes1 != null) return false;
        if (mes2 != null ? !mes2.equals(tabEntity.mes2) : tabEntity.mes2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mesType != null ? mesType.hashCode() : 0);
        result = 31 * result + (mes1 != null ? mes1.hashCode() : 0);
        result = 31 * result + (mes2 != null ? mes2.hashCode() : 0);
        return result;
    }
}
