package ConcatModule;

/**
* ConcatModule/ConcatHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ConcatModule.idl
* Monday, 29 May, 2023 7:14:33 PM IST
*/

public final class ConcatHolder implements org.omg.CORBA.portable.Streamable
{
  public ConcatModule.Concat value = null;

  public ConcatHolder ()
  {
  }

  public ConcatHolder (ConcatModule.Concat initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConcatModule.ConcatHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConcatModule.ConcatHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConcatModule.ConcatHelper.type ();
  }

}