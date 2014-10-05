/*******************************************************************************
 * Copyright 2014 uniVocity Software Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.univocity.articles.csvcomparison.parser;

import java.util.*;

public class Parsers {

	private static final List<AbstractParser> parsers = Arrays.asList(
			new CSVeedParser(),
			new CommonsCsvParser(),
			new EsperioCsvParser(),
			//new FlatpackParser(), appears to hang while processing worldcitiespop.txt
			new GenJavaParser(),
			new JavaCsvParser(),
			new JCsvParser(),
			new OpenCsvParser(),
			new SimpleCsvParser(),
			new SuperCsvParser(),
			new UnivocityParser(),
			new UnivocityParserWithFieldSelection(),
			new WayIoParser()
			);

	private Parsers() {

	}

	public static List<AbstractParser> list() {
		return Collections.unmodifiableList(parsers);
	}
}
