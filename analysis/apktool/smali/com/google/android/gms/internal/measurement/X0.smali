.class public final Lcom/google/android/gms/internal/measurement/X0;
.super Lcom/google/android/gms/internal/measurement/q2;
.source "SourceFile"


# static fields
.field private static final zzn:Lcom/google/android/gms/internal/measurement/X0;


# instance fields
.field private zzb:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:J

.field private zzl:Lcom/google/android/gms/internal/measurement/H2;

.field private zzm:Lcom/google/android/gms/internal/measurement/H2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/X0;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/X0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/measurement/X0;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/q2;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/q2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/q2;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/internal/measurement/H2;->r:Lcom/google/android/gms/internal/measurement/H2;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzl:Lcom/google/android/gms/internal/measurement/H2;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzm:Lcom/google/android/gms/internal/measurement/H2;

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzd:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zze:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzf:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzh:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzi:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzj:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public static O()Lcom/google/android/gms/internal/measurement/U0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/q2;->h()Lcom/google/android/gms/internal/measurement/p2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/measurement/U0;

    .line 8
    .line 9
    return-object v0
.end method

.method public static P()Lcom/google/android/gms/internal/measurement/X0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    return-object v0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final C()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final E()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final F()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzg:J

    return-wide v0
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final I()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final L()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzj:Ljava/lang/String;

    return-object v0
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzk:J

    return-wide v0
.end method

.method public final synthetic Q(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzd:Ljava/lang/String;

    return-void
.end method

.method public final synthetic R()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/X0;->zzd:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzd:Ljava/lang/String;

    return-void
.end method

.method public final synthetic S(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic T()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/X0;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic U(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final synthetic V()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/X0;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final synthetic W(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzg:J

    return-void
.end method

.method public final o(I)Ljava/lang/Object;
    .locals 13

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

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
    new-instance p1, Lcom/google/android/gms/internal/measurement/U0;

    .line 23
    .line 24
    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    .line 25
    .line 26
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/p2;-><init>(Lcom/google/android/gms/internal/measurement/q2;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/X0;

    .line 31
    .line 32
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/X0;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_3
    sget-object v10, Lcom/google/android/gms/internal/measurement/V0;->a:Lcom/google/android/gms/internal/measurement/G2;

    .line 37
    .line 38
    const-string v11, "zzm"

    .line 39
    .line 40
    sget-object v12, Lcom/google/android/gms/internal/measurement/W0;->a:Lcom/google/android/gms/internal/measurement/G2;

    .line 41
    .line 42
    const-string v0, "zzb"

    .line 43
    .line 44
    const-string v1, "zzd"

    .line 45
    .line 46
    const-string v2, "zze"

    .line 47
    .line 48
    const-string v3, "zzf"

    .line 49
    .line 50
    const-string v4, "zzg"

    .line 51
    .line 52
    const-string v5, "zzh"

    .line 53
    .line 54
    const-string v6, "zzi"

    .line 55
    .line 56
    const-string v7, "zzj"

    .line 57
    .line 58
    const-string v8, "zzk"

    .line 59
    .line 60
    const-string v9, "zzl"

    .line 61
    .line 62
    filled-new-array/range {v0 .. v12}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    .line 67
    .line 68
    new-instance v1, Lcom/google/android/gms/internal/measurement/R2;

    .line 69
    .line 70
    const-string v2, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\u0008\u1002\u0007\t2\n2"

    .line 71
    .line 72
    invoke-direct {v1, v0, v2, p1}, Lcom/google/android/gms/internal/measurement/R2;-><init>(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_4
    const/4 p1, 0x1

    .line 77
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

.method public final synthetic p(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzh:Ljava/lang/String;

    return-void
.end method

.method public final synthetic q()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/X0;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzh:Ljava/lang/String;

    return-void
.end method

.method public final synthetic r(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzi:Ljava/lang/String;

    return-void
.end method

.method public final synthetic s()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/X0;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzi:Ljava/lang/String;

    return-void
.end method

.method public final synthetic t(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzj:Ljava/lang/String;

    return-void
.end method

.method public final synthetic u()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/X0;->zzn:Lcom/google/android/gms/internal/measurement/X0;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/X0;->zzj:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzj:Ljava/lang/String;

    return-void
.end method

.method public final synthetic v(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/X0;->zzk:J

    return-void
.end method

.method public final w()Lcom/google/android/gms/internal/measurement/H2;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzl:Lcom/google/android/gms/internal/measurement/H2;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/H2;->q:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/H2;->a()Lcom/google/android/gms/internal/measurement/H2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzl:Lcom/google/android/gms/internal/measurement/H2;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzl:Lcom/google/android/gms/internal/measurement/H2;

    .line 14
    .line 15
    return-object v0
.end method

.method public final x()Lcom/google/android/gms/internal/measurement/H2;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzm:Lcom/google/android/gms/internal/measurement/H2;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/H2;->q:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/H2;->a()Lcom/google/android/gms/internal/measurement/H2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzm:Lcom/google/android/gms/internal/measurement/H2;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzm:Lcom/google/android/gms/internal/measurement/H2;

    .line 14
    .line 15
    return-object v0
.end method

.method public final y()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->zzd:Ljava/lang/String;

    return-object v0
.end method
