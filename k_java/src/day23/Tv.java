package day23;

public class Tv extends Product {

	static int count;
	{
		count++;
		this.t_number=count;
	}
	
	Tv(){
		super("TV",100,10);
	}
	int t_number;
	int monitor_size=70;   //ũ��
	String color="black";  //����
	int resolution = 3840; //�ػ�
	
}
