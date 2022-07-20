package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ProjectsPage;

import cucumber.api.java.en.*;

public class Projects {
	
	ProjectsPage project = new ProjectsPage();
	
	@And("^I Click on Search Tab$")
	public void i_Click_on_Search_Tab(){
		
		Elements.click(ProjectsPage.searchTab);
				
	}

	@And("^I enter the Project Name as \"([^\"]*)\"$")
	public void i_enter_the_Project_Name_as(String arg1){
		
		Elements.TypeText(ProjectsPage.searchTab, arg1);
		
	}

	@And("^I sort by Customer$")
	public void i_sort_by_Customer(){
		
		Elements.click(ProjectsPage.sortByCustomer);
		
	}

	@And("^I sort by Project$")
	public void i_sort_by_Project(){
		
		Elements.click(ProjectsPage.sortByProject);
		
	}

	@And("^I sort by Folder$")
	public void i_sort_by_Folder(){
		
		Elements.click(ProjectsPage.sortByFolder);
	}

	@And("^I sort by Project Start Date$")
	public void i_sort_by_Project_Start_Date(){
		
		Elements.click(ProjectsPage.sortByProjectStartDate);
		
	}

	@And("^I sort by Project End Date$")
	public void i_sort_by_Project_End_Date(){
		
		Elements.click(ProjectsPage.sortByProjectEndDate);
		
	}

	@And("^I click on Project Start Date Filter$")
	public void i_click_on_Project_Start_Date_Filter(){
		
		Elements.click(ProjectsPage.startDateFilter);
		
	}

	@And("^I click on Yesterday$")
	public void i_click_on_Yesterday(){
		
		Elements.click(ProjectsPage.yesterday);
		
	}

	@And("^I click on the Apply Filter of StartDate$")
	public void i_click_on_the_Apply_Filter_of_StartDate(){
		
		Elements.click(ProjectsPage.applyFilter);
		
	}

	@And("^I click on Reset Page of StartDate$")
	public void i_click_on_Reset_Page_of_StartDate(){
		
		Elements.click(ProjectsPage.resetPage);
		
	}

	@And("^I click on Project End Date Filter$")
	public void i_click_on_Project_End_Date_Filter(){
		
		Elements.click(ProjectsPage.enddateFilter);
		
	}

	@And("^I click on This Month$")
	public void i_click_on_This_Month(){
		
		Elements.click(ProjectsPage.tomorrow);
		
	}

	@And("^I click on the Apply Filter of EndDate$")
	public void i_click_on_the_Apply_Filter_of_EndDate(){
		
		Elements.click(ProjectsPage.applyFilter);
		
	}

	@And("^I click on Reset Page of EndDate$")
	public void i_click_on_Reset_Page_of_EndDate(){
		
		Elements.click(ProjectsPage.resetPage);
		
	}
	
	@And("^I click on next button of the Projects Page$")
	public void i_click_on_next_button_of_the_Projects_Page(){
		
		Elements.click(ProjectsPage.nextProject);
		
	}

	@And("^I click on last button of the Projects Page$")
	public void i_click_on_last_button_of_the_Projects_Page(){
		
		Elements.click(ProjectsPage.lastProject);
		
	}
	
	@And("^I click on Add Project$")
	public void i_click_on_Add_Project(){
		
		Elements.click(ProjectsPage.addProject);
		
	}

	@And("^I enter the Customer \"([^\"]*)\"$")
	public void i_enter_the_Customer(String arg1){
		
		Elements.TypeText(ProjectsPage.customer, arg1);
		
	}

	@And("^I enter the Project \"([^\"]*)\"$")
	public void i_enter_the_Project(String arg1){
		
		Elements.TypeText(ProjectsPage.projectName, arg1);
		
	}
	
	@And("^I enter the Folder \"([^\"]*)\"$")
	public void i_enter_the_Folder(String arg1){
		
		Elements.TypeText(ProjectsPage.folderName, arg1);
		
	}

	@And("^I enter the Project end date \"([^\"]*)\"$")
	public void i_enter_the_Project_end_date(String arg1) throws InterruptedException{
		
		Elements.click(ProjectsPage.endDateTab);
		
		Elements.TypeText(ProjectsPage.endDateTab, arg1);	
		//Elements.typeRandomNumber(ProjectsPage.endDateTab, 30/03/2023);
		/*WebElement n = ProjectsPage.endDateTab;
		Select sel = new Select(n);
		sel.selectByVisibleText("23");*/
			
	}

	@And("^I select the Project Confidentiality$")
	public void i_select_the_Project_Confidentiality(){
		
		Elements.click(ProjectsPage.confidential);
		
	}

	@And("^I save the new Project$")
	public void i_save_the_new_Project() throws InterruptedException{
		
		Elements.click(ProjectsPage.saveProject);
		Thread.sleep(7000);
		
	}
	
	@And("^I click on Projects member$")
	public void i_click_on_Projects_member(){
		
		Elements.click(ProjectsPage.projectMembers);
		
	}

	@And("^I click on Project member management$")
	public void i_click_on_Project_member_management(){
		
		Elements.click(ProjectsPage.projectMembersManage);
		
	}

	@And("^I click on save Project member$")
	public void i_click_on_save_Project_member(){
		
		Elements.click(ProjectsPage.saveProjectMembers);
		
	}
	
	@And("^I click on ellipsis$")
	public void i_click_on_ellipsis(){
		
		Elements.click(ProjectsPage.elipsis);
		
	}

	@And("^I click on Edit$")
	public void i_click_on_Edit(){
		
		Elements.click(ProjectsPage.editButton);
		
	}

	@And("^I edit confidentiality$")
	public void i_edit_confidentiality(){
		
		Elements.click(ProjectsPage.nonConfidential);
		
	}

	@And("^I save edited project$")
	public void i_save_edited_project(){
		
		Elements.click(ProjectsPage.saveEdit);
		
	}
	
	@And("^I click on Upload$")
	public void i_click_on_Upload(){
		
		Elements.click(ProjectsPage.upload);
		
	}

	@And("^I click on Browse Files$")
	public void i_click_on_Browse_Files(){
		
		Elements.click(ProjectsPage.browseFile);
		
	}

	@And("^I agree for Tearms and Conditions$")
	public void i_agree_for_Tearms_and_Conditions(){
		
		Elements.click(ProjectsPage.checkMark);
		
	}

	@And("^I click on Continue$")
	public void i_click_on_Continue() throws InterruptedException{
		
		//Elements.click(ProjectsPage.continueButton);
		//Thread.sleep(5000);
		//System.out.println("Uploaded");
		//ProjectsPage.upload1.sendKeys("C:\\Users\\preeti.sajjan\\Desktop\\LCF\\download1.jpg");
		//Elements.click(ProjectsPage.continueButton);
		Thread.sleep(3000);
	
	}

	@And("^I upload files from the path$")
	public void i_upload_files_from_the_path(){
		
		//Elements.click(ProjectsPage.continueButton);
		
	}

	@And("^I click on Upload file$")
	public void i_click_on_Upload_file() throws InterruptedException{
		
		//Elements.click(ProjectsPage.uploadFile);
		//Thread.sleep(5000);
	}


}
