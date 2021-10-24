package uni.miskolc.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceImplTest {

	@Mock
	Dependency dependency;

	@InjectMocks
	ServiceImpl service;

	@Test
	void getImportantAbstractCallImportant() {
		//GIVEN
		final String importantText = "LongString";
		final String expectText = "Lon...";
		
		//WHEN
		service.getImportantAbstract(importantText);
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		
		//THEN
		verify(dependency, times(1)).importantString(captor.capture());
		assertEquals(expectText, captor.getValue());
	}
	
	
	@Test
	void calculateTest() {
		// GIVEN

		// WHEN
		service.calculate();

		// THEN
		verify(dependency, times(1)).helpNoParameterNoReturnValue();
	}

	@Test
	void return5Test() {
		// GIVEN
		final int FIVE = 5;

		// WHEN
		int result = service.return5();

		// THEN
		assertEquals(FIVE, result);
	}

	@Test
	void dependencyReturnValueIsUsedTest() {
		// GIVEN
		final int FIVE = 5;

		when(dependency.helpNoParameterReturnValue()).thenReturn(FIVE);

		// WHEN
		int result = service.callHelpAndUseReturnValue();

		// THEN
		verify(dependency, times(1)).helpNoParameterReturnValue();
		assertEquals(FIVE, result);
	}

	@Test
	void callHelpAndPassParameter5Test() {
		// GIVEN
		final int FIVE = 5;

		// WHEN
		service.callHelpAndPassParameter5();

		// THEN
		ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);

		verify(dependency, times(1)).helpWithParameterNoReturnValue(captor.capture());
		assertEquals(FIVE, captor.getValue());
	}

	
}
//