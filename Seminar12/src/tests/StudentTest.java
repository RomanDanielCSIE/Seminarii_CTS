package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest extends Object {

    @Test
    public void testCorectitudineConstructorCuParametru(){
        String nume="Gigel";
        Student student = new Student(nume);
        assertEquals(nume,student.getNume());
    }

    @Test
    public void testInitializareListaInConstructor(){
        Student student = new Student("Gigel");
        assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorDefault(){
        Student student = new Student();
        assertNotNull("Numele nu a fost initializat",student.getNume());
        assertNotNull("Lista nu a fost initializata",student.getNote());
    }

    @Test
    public void testMetodaAdaugareNotaLista(){
        Student student = new Student();
        int nota =10;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testDimensiuneLista(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(2,student.getNote().size());
    }

    @Test
    public void testCalculeazaMediaCorect(){
        Student student= new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5f,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testVerificareRestanta(){
        Student student = new Student();
        student.adaugaNota(4);
        assertTrue(student.areRestante());
    }

    @Test
    public void testVerificareFaraRestanta(){
        Student student = new Student();
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }

    @Test
    public void testGetNotaIndexInvalid(){
        Student student=new Student();
        student.adaugaNota(5);
        try{
            int i = student.getNota(-1);
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        }
        catch (IndexOutOfBoundsException ex){

        }
        catch (Exception ex){
            fail("Tipul exceptiei aruncate nu este corect");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaInvalidJunit4(){
        Student student = new Student();
        student.adaugaNota(10);

        int nota = student.getNota(-1);
    }
}