package greedy;

import main.greedy.PartitionLabels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionLabelsTest {

    @Test
    void partitionLabels() {
        String input = "ababcbacadefegdehijhklij";
        assertEquals(3, new PartitionLabels().partitionLabels(input).size());

        input = "caedbdedda";

        assertEquals(2, new PartitionLabels().partitionLabels(input).size());
    }
}