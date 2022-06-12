// Name: Anashwara Rajinkumar Puthlat
// USC NetID: puthlat
// USC ID: 2138-2056-39
// CS 455 Lab 8
// Fall 2021

import java.io.IOException;

/**
   This class reports bad input data.
*/
public class BadDataException extends IOException
{
   public BadDataException() {}
   public BadDataException(String message)
   {
      super(message);
   }
}
