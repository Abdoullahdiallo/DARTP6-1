package CorbaConversion;

/**
* CorbaConversion/IConversionReemoteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Conversion.idl
* vendredi 1 d�cembre 2023 11 h 04 CET
*/

public final class IConversionReemoteHolder implements org.omg.CORBA.portable.Streamable
{
  public CorbaConversion.IConversionReemote value = null;

  public IConversionReemoteHolder ()
  {
  }

  public IConversionReemoteHolder (CorbaConversion.IConversionReemote initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CorbaConversion.IConversionReemoteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CorbaConversion.IConversionReemoteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CorbaConversion.IConversionReemoteHelper.type ();
  }

}
