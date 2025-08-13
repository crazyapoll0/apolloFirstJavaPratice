package chapter24;

import java.io.*;

public class Exam {

	public static void main(String[] args) {
		String scr = "C:/Users/codehows/Desktop/leon.jpg";				
		String path = "C:/Users/codehows/Desktop/newFolder";
		String fileName = "leon2.jpg";
		String dst = path + "/" + fileName;
		
		File dir = new File(path);

					if (!dir.exists()) {
						dir.mkdirs();
						System.out.println("폴더가 없어서 만들었습니다.");
					} else {
						System.out.println("폴더가 이미 있습니다.");
					}
					
		
		long start = System.nanoTime();
		
		try(BufferedInputStream fis = 
				new BufferedInputStream(new FileInputStream(scr)); 
		BufferedOutputStream fos = 
				new BufferedOutputStream(new FileOutputStream(dst));) 
				{ 					
					
					int chunk;
					while ((chunk = fis.read()) != -1) {
						fos.write(chunk);
					}
					
					long end = System.nanoTime();
					System.out.println("걸린 시간 : " + (end - start) + "ns");

				} catch (FileNotFoundException e) {
					System.err.println("해당 파일이 존재하지 않습니다.");
				} catch (IOException e) {
					System.err.println("입출력 중 문제 발생");
				}

			}
		}