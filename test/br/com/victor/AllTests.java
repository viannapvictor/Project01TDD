package br.com.victor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ClienteDaoTest.class})
public class AllTests {
}
