package com.green.day69;

public class UserDtoTest {
    public static void main(String[] args) {
        UserDto dto = new UserDto();
        //홍길동, 20
        dto.setAge(20);
        dto.setName("홍길동");
        dto.setAddr("서울");

        UserChainingDto dto2 = new UserChainingDto();
        UserChainingDto dd = dto2.setAge(21).setName("유관순").setAddr("대구");

        //1. dto2.setAge(21) 이 메소드 뒤에 . 을 적을 수 있는 이유는 참조변수값을 리턴하기 때문
        //2. 1번리턴주소값.setName("유관순")
        //3. 2번리턴주소값.setAddr("대구")
        //4. dd = 3번리턴주소값

        System.out.println(dto);
        System.out.println(dto2);
    }
}
