// محاكاة البيانات الجاهزة (Mock Data) كخطة بديلة لحماية البروجي من البلوكاج
const mockLignes = [
    { id: 1, nom: "Ligne Express 01", depart: "Béni Mellal", arrivee: "Casablanca", horaire: "08:30", statut: "En Service" },
    { id: 2, nom: "Ligne Régionale 45", depart: "Fès", arrivee: "Meknès", horaire: "10:15", statut: "En Service" },
    { id: 3, nom: "Ligne Inter-urbaine", depart: "Kénitra", arrivee: "Rabat", horaire: "14:00", statut: "Maintenance" },
    { id: 4, nom: "Ligne Navette 12", depart: "Marrakech", arrivee: "Aéroport", horaire: "07:00", statut: "En Service" }
];

const apiUrl = 'http://localhost:8088/api/lignes';

// دالة لجلب البيانات وعرضها ف الجدول
async function chargerLignes() {
    const tableBody = document.getElementById('lignes-table-body');
    if (!tableBody) return;
    tableBody.innerHTML = ''; 

    try {
        // محاولة الاتصال بـ الـ Backend د Spring Boot اللّي صاوبنا
        const response = await fetch(apiUrl);
        if (!response.ok) throw new Error('Erreur serveur');
        const lignes = await response.json();
        afficherDonnees(lignes);
    } catch (error) {
        console.warn("Backend non détecté ou problème CORS. Utilisation des données locales (Mock Data).");
        // إذا تبلكا السيرفر أو الـ CORS، كنعرضو البيانات المحلية فورا بلا ما يتبلكا السيت
        afficherDonnees(mockLignes);
    }
}

function afficherDonnees(donnees) {
    const tableBody = document.getElementById('lignes-table-body');
    donnees.forEach(ligne => {
        const badgeClass = ligne.statut === "Maintenance" ? "bg-warning" : "bg-success";
        const row = `
            <tr>
                <td><strong>#${ligne.id}</strong></td>
                <td><span class="fw-semibold text-dark">${ligne.nom}</span></td>
                <td><span class="badge bg-primary">${ligne.depart}</span></td>
                <td><span class="badge bg-info text-dark">${ligne.arrivee}</span></td>
                <td><span class="text-muted fw-bold">${ligne.horaire}</span></td>
                <td><span class="badge ${badgeClass}">${ligne.statut || 'En Service'}</span></td>
            </tr>
        `;
        tableBody.innerHTML += row;
    });
}

// تشغيل الدالة تلقائياً عند فتح الصفحة
document.addEventListener('DOMContentLoaded', chargerLignes);