.class public final Lcom/google/android/gms/internal/measurement/f1;
.super Lcom/google/android/gms/internal/measurement/q2;
.source "SourceFile"


# static fields
.field private static final zzf:Lcom/google/android/gms/internal/measurement/f1;


# instance fields
.field private zzb:I

.field private zzd:I

.field private zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/f1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/q2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/measurement/f1;->zzf:Lcom/google/android/gms/internal/measurement/f1;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/measurement/f1;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/q2;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/q2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static p()Lcom/google/android/gms/internal/measurement/e1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/f1;->zzf:Lcom/google/android/gms/internal/measurement/f1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/q2;->h()Lcom/google/android/gms/internal/measurement/p2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/measurement/e1;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final o(I)Ljava/lang/Object;
    .locals 4

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_3

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lcom/google/android/gms/internal/measurement/f1;->zzf:Lcom/google/android/gms/internal/measurement/f1;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/e1;

    .line 23
    .line 24
    sget-object v0, Lcom/google/android/gms/internal/measurement/f1;->zzf:Lcom/google/android/gms/internal/measurement/f1;

    .line 25
    .line 26
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/p2;-><init>(Lcom/google/android/gms/internal/measurement/q2;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/f1;

    .line 31
    .line 32
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/q2;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/B0;->h:Lcom/google/android/gms/internal/measurement/B0;

    .line 37
    .line 38
    const-string v0, "zze"

    .line 39
    .line 40
    sget-object v1, Lcom/google/android/gms/internal/measurement/B0;->i:Lcom/google/android/gms/internal/measurement/B0;

    .line 41
    .line 42
    const-string v2, "zzb"

    .line 43
    .line 44
    const-string v3, "zzd"

    .line 45
    .line 46
    filled-new-array {v2, v3, p1, v0, v1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lcom/google/android/gms/internal/measurement/f1;->zzf:Lcom/google/android/gms/internal/measurement/f1;

    .line 51
    .line 52
    new-instance v1, Lcom/google/android/gms/internal/measurement/R2;

    .line 53
    .line 54
    const-string v2, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001"

    .line 55
    .line 56
    invoke-direct {v1, v0, v2, p1}, Lcom/google/android/gms/internal/measurement/R2;-><init>(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_4
    const/4 p1, 0x1

    .line 61
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method public final q()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/f1;->zzd:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v1, :cond_3

    const/4 v3, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    goto :goto_0

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    move v2, v1

    :cond_3
    :goto_0
    if-nez v2, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method public final r()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/f1;->zze:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :cond_1
    move v2, v1

    :cond_2
    :goto_0
    if-nez v2, :cond_3

    return v1

    :cond_3
    return v2
.end method

.method public final synthetic s(I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/f1;->zzd:I

    iget p1, p0, Lcom/google/android/gms/internal/measurement/f1;->zzb:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/f1;->zzb:I

    return-void
.end method

.method public final synthetic t(I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/f1;->zze:I

    iget p1, p0, Lcom/google/android/gms/internal/measurement/f1;->zzb:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/measurement/f1;->zzb:I

    return-void
.end method
