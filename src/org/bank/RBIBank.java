package org.bank;

public class RBIBank implements GovtOfIndia {

	@Override
	public void repoRate() {
		System.out.println("RepoRate is 7%");
		
	}

	@Override
	public void reverseRepoRate() {
		System.out.println("Reverse Repo Rate is 8%");
		
	}
	public static void main(String[] args) {
		RBIBank r =new RBIBank();
		r.repoRate();
		r.reverseRepoRate();
	}

}
