package com.metamx.common.parsers;

import java.util.List;

/**
 */
public interface ParserFactory
{
  public Parser makeParser(String delimiter, String header, List<String> columns) throws ParseException;
}