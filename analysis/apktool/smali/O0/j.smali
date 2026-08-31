.class public final LO0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final r:LO0/j;

.field public static final s:LO0/j;

.field public static final t:LO0/j;

.field public static final u:LO0/j;


# instance fields
.field public final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, LO0/j;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, LO0/j;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LO0/j;

    .line 9
    .line 10
    const/16 v2, 0xc8

    .line 11
    .line 12
    invoke-direct {v1, v2}, LO0/j;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, LO0/j;

    .line 16
    .line 17
    const/16 v3, 0x12c

    .line 18
    .line 19
    invoke-direct {v2, v3}, LO0/j;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, LO0/j;

    .line 23
    .line 24
    const/16 v4, 0x190

    .line 25
    .line 26
    invoke-direct {v3, v4}, LO0/j;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v4, LO0/j;

    .line 30
    .line 31
    const/16 v5, 0x1f4

    .line 32
    .line 33
    invoke-direct {v4, v5}, LO0/j;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v5, LO0/j;

    .line 37
    .line 38
    const/16 v6, 0x258

    .line 39
    .line 40
    invoke-direct {v5, v6}, LO0/j;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v5, LO0/j;->r:LO0/j;

    .line 44
    .line 45
    new-instance v6, LO0/j;

    .line 46
    .line 47
    const/16 v7, 0x2bc

    .line 48
    .line 49
    invoke-direct {v6, v7}, LO0/j;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v7, LO0/j;

    .line 53
    .line 54
    const/16 v8, 0x320

    .line 55
    .line 56
    invoke-direct {v7, v8}, LO0/j;-><init>(I)V

    .line 57
    .line 58
    .line 59
    new-instance v8, LO0/j;

    .line 60
    .line 61
    const/16 v9, 0x384

    .line 62
    .line 63
    invoke-direct {v8, v9}, LO0/j;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v3, LO0/j;->s:LO0/j;

    .line 67
    .line 68
    sput-object v4, LO0/j;->t:LO0/j;

    .line 69
    .line 70
    sput-object v6, LO0/j;->u:LO0/j;

    .line 71
    .line 72
    filled-new-array/range {v0 .. v8}, [LO0/j;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->A([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LO0/j;->q:I

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-gt v1, p1, :cond_0

    .line 9
    .line 10
    const/16 v2, 0x3e9

    .line 11
    .line 12
    if-ge p1, v2, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    :cond_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "Font weight can be in range [1, 1000]. Current value: "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, LQ0/a;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, LO0/j;

    .line 2
    .line 3
    iget v0, p0, LO0/j;->q:I

    .line 4
    .line 5
    iget p1, p1, LO0/j;->q:I

    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->f(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LO0/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LO0/j;

    .line 12
    .line 13
    iget p1, p1, LO0/j;->q:I

    .line 14
    .line 15
    iget v1, p0, LO0/j;->q:I

    .line 16
    .line 17
    if-eq v1, p1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, LO0/j;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FontWeight(weight="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, LO0/j;->q:I

    .line 9
    .line 10
    const/16 v2, 0x29

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LC0/S;->o(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
