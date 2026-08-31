.class public final Lcom/google/android/gms/internal/clearcut/D;
.super Lcom/google/android/gms/internal/clearcut/h;

# interfaces
.implements Lcom/google/android/gms/internal/clearcut/E;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final r:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/clearcut/D;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/clearcut/D;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Lcom/google/android/gms/internal/clearcut/h;->q:Z

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/clearcut/D;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/clearcut/h;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final G()Lcom/google/android/gms/internal/clearcut/E;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/h;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/internal/clearcut/d0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/clearcut/d0;-><init>(Lcom/google/android/gms/internal/clearcut/D;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    return-object p0
.end method

.method public final synthetic add(ILjava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/h;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/h;->d()V

    instance-of v0, p2, Lcom/google/android/gms/internal/clearcut/E;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/android/gms/internal/clearcut/E;

    invoke-interface {p2}, Lcom/google/android/gms/internal/clearcut/E;->v()Ljava/util/List;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    move-result p1

    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/clearcut/D;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/h;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    instance-of v2, v1, Lcom/google/android/gms/internal/clearcut/m;

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    check-cast v1, Lcom/google/android/gms/internal/clearcut/m;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v2, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v3, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, v1, Lcom/google/android/gms/internal/clearcut/m;->r:[B

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/m;->d()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-direct {v3, v4, v5, v6, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 47
    .line 48
    .line 49
    move-object v2, v3

    .line 50
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/m;->d()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iget-object v4, v1, Lcom/google/android/gms/internal/clearcut/m;->r:[B

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v3

    .line 61
    sget-object v5, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    .line 62
    .line 63
    invoke-virtual {v5, v4, v3, v1}, Lcom/google/android/gms/internal/clearcut/l0;->t([BII)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_2
    return-object v2

    .line 73
    :cond_3
    check-cast v1, [B

    .line 74
    .line 75
    new-instance v2, Ljava/lang/String;

    .line 76
    .line 77
    sget-object v3, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 80
    .line 81
    .line 82
    sget-object v3, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    array-length v5, v1

    .line 86
    invoke-virtual {v3, v1, v4, v5}, Lcom/google/android/gms/internal/clearcut/l0;->t([BII)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_4
    return-object v2
.end method

.method public final n(I)Lcom/google/android/gms/internal/clearcut/A;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    new-instance p1, Lcom/google/android/gms/internal/clearcut/D;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/clearcut/D;-><init>(Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/h;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 15
    .line 16
    instance-of v0, p1, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/clearcut/m;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    check-cast p1, Lcom/google/android/gms/internal/clearcut/m;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v0, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string p1, ""

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, p1, Lcom/google/android/gms/internal/clearcut/m;->r:[B

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/m;->d()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-direct {v1, v2, v3, p1, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_2
    check-cast p1, [B

    .line 60
    .line 61
    new-instance v0, Ljava/lang/String;

    .line 62
    .line 63
    sget-object v1, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p2, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/h;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of p2, p1, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    instance-of p2, p1, Lcom/google/android/gms/internal/clearcut/m;

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    check-cast p1, Lcom/google/android/gms/internal/clearcut/m;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object p2, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string p1, ""

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, Lcom/google/android/gms/internal/clearcut/m;->r:[B

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/m;->d()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/m;->size()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-direct {v0, v1, v2, p1, p2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    check-cast p1, [B

    .line 56
    .line 57
    new-instance p2, Ljava/lang/String;

    .line 58
    .line 59
    sget-object v0, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 60
    .line 61
    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 62
    .line 63
    .line 64
    return-object p2
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/D;->r:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
