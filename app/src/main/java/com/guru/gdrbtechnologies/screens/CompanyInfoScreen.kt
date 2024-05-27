package com.guru.gdrbtechnologies.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guru.gdrbtechnologies.R


@Composable
fun ListViewMobile(items: List<RecordItem>) {
    LazyColumn {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gdrb_logo),
                        contentDescription = "Company Logo",
                        modifier = Modifier.size(80.dp)
                    )
                    Column {
                        Text(
                            text = "Tax Registration Number:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Text(
                            text = item.taxRegistrationNumber,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Investor:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Text(
                            text = item.investor,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "SCZone License No:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black,
                        )
                        Text(
                            text = item.sczoneLicenseNo,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Nature of Business:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Text(
                            text = item.natureOfBusiness,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Status:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Box(
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFEEF6E5),
                                    shape = RoundedCornerShape(10.dp)
                                )
                        ) {
                            Text(
                                modifier = Modifier.padding(3.dp),
                                text = item.status,
                                color = Color.Green,
                                style = MaterialTheme.typography.bodySmall
                            )
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            IconButton(onClick = { /* TODO: Edit Action */ }) {
                                Icon(Icons.Default.Edit, contentDescription = "Edit")
                            }
                            IconButton(onClick = { /* TODO: Refresh Action */ }) {
                                Icon(Icons.Default.Refresh, contentDescription = "Refresh")
                            }
                            IconButton(onClick = { /* TODO: List Action */ }) {
                                Icon(Icons.Default.List, contentDescription = "List")
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Form Number:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Text(
                            text = item.formNumber,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Form Procedure:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Text(
                            text = item.formProcedure,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Process:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black
                        )
                        Text(
                            text = item.process,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Declaration Procedure:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black,
                        )
                        Text(
                            text = item.declarationProcedure,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Created Date:",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Black,
                        )
                        Text(
                            text = item.createdDate,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ListViewTab(items: List<RecordItem>) {
    LazyColumn {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.gdrb_logo),
                            contentDescription = "Company Logo",
                            modifier = Modifier.size(80.dp)
                        )
                        Row(modifier = Modifier.padding(6.dp)) {
                            Column(modifier = Modifier.padding(6.dp)) {
                                Text(
                                    text = "Tax Registration Number:",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.Black
                                )
                                Text(
                                    text = item.taxRegistrationNumber,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Column(modifier = Modifier.padding(6.dp)) {
                                Text(
                                    text = "Investor:",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.Black
                                )
                                Text(
                                    text = item.investor,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Column(modifier = Modifier.padding(6.dp)) {
                                Text(
                                    text = "SCZone License No:",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.Black,
                                )
                                Text(
                                    text = item.sczoneLicenseNo,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Column(modifier = Modifier.padding(6.dp)) {
                                Text(
                                    text = "Nature of Business:",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.Black
                                )
                                Text(
                                    text = item.natureOfBusiness,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Column(modifier = Modifier.padding(4.dp)) {
                                Text("Status: ", style = MaterialTheme.typography.bodySmall)
                                Box(
                                    modifier = Modifier
                                        .background(
                                            color = Color(0xFFEEF6E5),
                                            shape = RoundedCornerShape(10.dp)
                                        )
                                ) {
                                    Text(
                                        item.status,
                                        color = Color.Green,
                                        modifier = Modifier.padding(3.dp),
                                        style = MaterialTheme.typography.bodySmall
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        Column(modifier = Modifier.padding(6.dp)) {
                            Text(
                                text = "Form Number:",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Black
                            )
                            Text(
                                text = item.formNumber,
                                style = MaterialTheme.typography.titleSmall,
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Column(modifier = Modifier.padding(6.dp)) {
                            Text(
                                text = "Form Procedure:",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Black
                            )
                            Text(
                                text = item.formProcedure,
                                style = MaterialTheme.typography.titleSmall,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Column(modifier = Modifier.padding(6.dp)) {
                            Text(
                                text = "Process:",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Black
                            )
                            Text(
                                text = item.process,
                                style = MaterialTheme.typography.titleSmall,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Column(modifier = Modifier.padding(6.dp)) {
                            Text(
                                text = "Declaration Procedure:",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Black,
                            )
                            Text(
                                text = item.declarationProcedure,
                                style = MaterialTheme.typography.titleSmall,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Column(modifier = Modifier.padding(6.dp)) {
                            Text(
                                text = "Created Date:",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Black,
                            )
                            Text(
                                text = item.createdDate,
                                style = MaterialTheme.typography.titleSmall,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}


data class RecordItem(
    val taxRegistrationNumber: String,
    val investor: String,
    val sczoneLicenseNo: String,
    val natureOfBusiness: String,
    val status: String,
    val formProcedure: String,
    val formNumber: String,
    val process: String,
    val declarationProcedure: String,
    val createdDate: String
)

@Composable
fun ResponsiveScreen() {
    val items = listOf(
        RecordItem(
            taxRegistrationNumber = "671-812-785",
            investor = "Turner Inc",
            sczoneLicenseNo = "TI Logistics NVWH-01",
            natureOfBusiness = "Logistics",
            status = "Approved",
            formNumber = "OUT-EGAIS-001216-11-2023",
            formProcedure = "Handling",
            process = "Other Regime",
            declarationProcedure = "Export To Different Regions \nOf Pending Tax Regulations",
            createdDate = "November 6, 2023"
        ), RecordItem(
            taxRegistrationNumber = "671-812-785",
            investor = "Turner Inc",
            sczoneLicenseNo = "TI Logistics PWH-01",
            natureOfBusiness = "Logistics",
            status = "Approved",
            formNumber = "OUT-EGPSE-001207-11-2023",
            formProcedure = "Handling",
            process = "Sczone Project",
            declarationProcedure = "Handling Between Two \nProjects within the SCZone",
            createdDate = "November 6, 2023"
        ),
        RecordItem(
            taxRegistrationNumber = "671-812-785",
            investor = "Turner Inc",
            sczoneLicenseNo = "TI Logistics NVWH-01",
            natureOfBusiness = "Logistics",
            status = "Approved",
            formNumber = "OUT-EGAIS-001216-11-2023",
            formProcedure = "Handling",
            process = "Other Regime",
            declarationProcedure = "Export To Different Regions \nOf Pending Tax Regulations",
            createdDate = "November 6, 2023"
        ), RecordItem(
            taxRegistrationNumber = "671-812-785",
            investor = "Turner Inc",
            sczoneLicenseNo = "TI Logistics PWH-01",
            natureOfBusiness = "Logistics",
            status = "Approved",
            formNumber = "OUT-EGPSE-001207-11-2023",
            formProcedure = "Handling",
            process = "Sczone Project",
            declarationProcedure = "Handling Between Two \nProjects within the SCZone",
            createdDate = "November 6, 2023"
        ),
        RecordItem(
            taxRegistrationNumber = "671-812-785",
            investor = "Turner Inc",
            sczoneLicenseNo = "TI Logistics NVWH-01",
            natureOfBusiness = "Logistics",
            status = "Approved",
            formNumber = "OUT-EGAIS-001216-11-2023",
            formProcedure = "Handling",
            process = "Other Regime",
            declarationProcedure = "Export To Different Regions \nOf Pending Tax Regulations",
            createdDate = "November 6, 2023"
        ), RecordItem(
            taxRegistrationNumber = "671-812-785",
            investor = "Turner Inc",
            sczoneLicenseNo = "TI Logistics PWH-01",
            natureOfBusiness = "Logistics",
            status = "Approved",
            formNumber = "OUT-EGPSE-001207-11-2023",
            formProcedure = "Handling",
            process = "Sczone Project",
            declarationProcedure = "Handling Between Two \nProjects within the SCZone",
            createdDate = "November 6, 2023"
        )
    )
    MainScreen(items)
}

@Composable
fun MainScreen(items: List<RecordItem>) {
    BoxWithConstraints {
        if (maxWidth < 600.dp) {
            // Mobile View: Column Layout
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                ListViewMobile(items)
            }
        } else {
            // Tablet View: Side-by-Side Layout
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    ListViewTab(items)
                }
            }
        }
    }
}


@Preview(showBackground = true, widthDp = 320)
@Composable
fun MobilePreview() {
    ResponsiveScreen()
}

@Preview(showBackground = true, widthDp = 800)
@Composable
fun TabletPreview() {
    ResponsiveScreen()
}
