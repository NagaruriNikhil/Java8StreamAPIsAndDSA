package Java8;

public class Project {

    @Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", name=" + name + ", client=" + client + ", buLeadName="
				+ buLeadName + "]";
	}

	private String projectCode;
    private String name;
    private String client;
    private String buLeadName;

    // No-args constructor
    public Project() {
    }

    // All-args constructor
    public Project(String projectCode, String name, String client, String buLeadName) {
        this.projectCode = projectCode;
        this.name = name;
        this.client = client;
        this.buLeadName = buLeadName;
    }

    // Getters and Setters
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBuLeadName() {
        return buLeadName;
    }

    public void setBuLeadName(String buLeadName) {
        this.buLeadName = buLeadName;
    }

    // Builder Pattern
    public static class Builder {
        private String projectCode;
        private String name;
        private String client;
        private String buLeadName;

        public Builder projectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder client(String client) {
            this.client = client;
            return this;
        }

        public Builder buLeadName(String buLeadName) {
            this.buLeadName = buLeadName;
            return this;
        }

        public Project build() {
            return new Project(projectCode, name, client, buLeadName);
        }
    }

    // Static method to initiate the builder
    public static Builder builder() {
        return new Builder();
    }

    // Main method for testing
    public static void main(String[] args) {
        Project project = Project.builder()
                .projectCode("P001")
                .name("Project A")
                .client("Client X")
                .buLeadName("John Doe")
                .build();

        System.out.println("Project Code: " + project.getProjectCode());
        System.out.println("Name: " + project.getName());
        System.out.println("Client: " + project.getClient());
        System.out.println("BU Lead Name: " + project.getBuLeadName());
    }
}
