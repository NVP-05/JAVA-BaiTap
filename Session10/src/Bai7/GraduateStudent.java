package Bai7;

class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (researchTopic == null || researchTopic.isEmpty() || supervisorName == null || supervisorName.isEmpty()) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài: " + researchTopic + ", GVHD: " + supervisorName;
    }
}

