package iterator.pseu;

public interface SocialNetwork {
    ProfileIterator createFrIterator(String profileName);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
