package com.cginfo.test.simplespring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Bean1WithMockitoTest {

    @Mock
    private IBean1 bean1;

    /**
     * http://docs.mockito.googlecode.com/hg/latest/org/mockito/Mockito.html
     */
    @Before
    public void before()
    {
    	//创建mock行为，就是模拟这个其实没有被创建的类在指定方法指定参数下返回指定结果。
         when(bean1.hello("world")).thenReturn("Hello, world");
    }

    @Test
    public void testHello()
    {
        System.out.println(getClass().getName() + ".testHello");
        //given
        String result;
        //when

        result = bean1.hello("world");

        //then
        assertThat(result).isEqualTo("Hello, world");

    }
}
