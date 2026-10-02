// app/latihan-audit/page.tsx
export default function LatihanAudit() {
  return (
    <main className="p-8">
      {/* Menggunakan h1 untuk heading utama */}
      <h1 className="text-2xl font-bold">Katalog Alat Laboratorium</h1>

      {/* Menambahkan alt pada gambar */}
      <img src="/next.svg" width={120} height={24} alt="Next.js Logo" />

      {/* Mengubah warna teks ke gray-700 agar memenuhi rasio kontras 4.5:1 */}
      <p className="text-gray-700">Stok diperbarui setiap hari.</p>

      <form className="mt-4 flex items-center gap-2">
        {/* Menambahkan label yang terhubung ke input */}
        <label htmlFor="pencarian" className="sr-only">
          Cari alat laboratorium
        </label>
        <input
          id="pencarian"
          type="search"
          placeholder="Cari alat..."
          className="border p-2 rounded"
        />

        {/* Menambahkan aria-label pada tombol yang hanya berisi SVG */}
        <button
          type="submit"
          aria-label="Cari"
          className="border p-2 rounded bg-gray-100 hover:bg-gray-200"
        >
          <svg
            width="16"
            height="16"
            viewBox="0 0 16 16"
            aria-hidden="true"
            focusable="false"
          >
            <circle cx="7" cy="7" r="5" stroke="currentColor" fill="none" />
          </svg>
        </button>
      </form>
    </main>
  );
}