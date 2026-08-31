.class public final LL0/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LL0/B;

.field public final b:LE/a0;

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(LL0/B;LE/a0;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL0/C;->a:LL0/B;

    .line 5
    .line 6
    iput-object p2, p0, LL0/C;->b:LE/a0;

    .line 7
    .line 8
    iput-wide p3, p0, LL0/C;->c:J

    .line 9
    .line 10
    iget-object p1, p2, LE/a0;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 p4, 0x0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    move p3, p4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p3, 0x0

    .line 24
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LL0/n;

    .line 29
    .line 30
    iget-object v0, v0, LL0/n;->a:LL0/a;

    .line 31
    .line 32
    iget-object v0, v0, LL0/a;->d:LM0/j;

    .line 33
    .line 34
    invoke-virtual {v0, p3}, LM0/j;->c(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    :goto_0
    iput p3, p0, LL0/C;->d:F

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {p1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, LL0/n;

    .line 52
    .line 53
    iget-object p3, p1, LL0/n;->a:LL0/a;

    .line 54
    .line 55
    iget-object p3, p3, LL0/a;->d:LM0/j;

    .line 56
    .line 57
    iget p4, p3, LM0/j;->f:I

    .line 58
    .line 59
    add-int/lit8 p4, p4, -0x1

    .line 60
    .line 61
    invoke-virtual {p3, p4}, LM0/j;->c(I)F

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    iget p1, p1, LL0/n;->f:F

    .line 66
    .line 67
    add-float p4, p3, p1

    .line 68
    .line 69
    :goto_1
    iput p4, p0, LL0/C;->e:F

    .line 70
    .line 71
    iget-object p1, p2, LE/a0;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    iput-object p1, p0, LL0/C;->f:Ljava/util/ArrayList;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LL0/C;->b:LE/a0;

    .line 2
    .line 3
    iget-object v1, v0, LE/a0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v0, v0, LE/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LL0/l;

    .line 10
    .line 11
    iget-object v0, v0, LL0/l;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LL0/d;

    .line 14
    .line 15
    iget-object v0, v0, LL0/d;->r:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez p1, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p1, v1}, Ly4/b;->o(ILjava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LL0/n;

    .line 41
    .line 42
    iget-object v1, v0, LL0/n;->a:LL0/a;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, LL0/n;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v1, v1, LL0/a;->d:LM0/j;

    .line 49
    .line 50
    iget-object v1, v1, LM0/j;->e:Landroid/text/Layout;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget v0, v0, LL0/n;->d:I

    .line 57
    .line 58
    add-int/2addr p1, v0

    .line 59
    return p1
.end method

.method public final b(F)I
    .locals 8

    .line 1
    iget-object v0, p0, LL0/C;->b:LE/a0;

    .line 2
    .line 3
    iget-object v0, v0, LE/a0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v1, p1, v1

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-gtz v1, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    invoke-static {v0}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, LL0/n;

    .line 19
    .line 20
    iget v1, v1, LL0/n;->g:F

    .line 21
    .line 22
    cmpl-float v1, p1, v1

    .line 23
    .line 24
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v3, 0x1

    .line 36
    sub-int/2addr v1, v3

    .line 37
    move v4, v2

    .line 38
    :goto_0
    if-gt v4, v1, :cond_6

    .line 39
    .line 40
    add-int v5, v4, v1

    .line 41
    .line 42
    ushr-int/2addr v5, v3

    .line 43
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, LL0/n;

    .line 48
    .line 49
    iget v7, v6, LL0/n;->f:F

    .line 50
    .line 51
    cmpl-float v7, v7, p1

    .line 52
    .line 53
    if-lez v7, :cond_2

    .line 54
    .line 55
    move v6, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget v6, v6, LL0/n;->g:F

    .line 58
    .line 59
    cmpg-float v6, v6, p1

    .line 60
    .line 61
    if-gtz v6, :cond_3

    .line 62
    .line 63
    const/4 v6, -0x1

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move v6, v2

    .line 66
    :goto_1
    if-gez v6, :cond_4

    .line 67
    .line 68
    add-int/lit8 v4, v5, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    if-lez v6, :cond_5

    .line 72
    .line 73
    add-int/lit8 v1, v5, -0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    move v2, v5

    .line 77
    goto :goto_2

    .line 78
    :cond_6
    add-int/2addr v4, v3

    .line 79
    neg-int v2, v4

    .line 80
    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, LL0/n;

    .line 85
    .line 86
    iget v1, v0, LL0/n;->c:I

    .line 87
    .line 88
    iget v2, v0, LL0/n;->d:I

    .line 89
    .line 90
    iget v3, v0, LL0/n;->b:I

    .line 91
    .line 92
    sub-int/2addr v1, v3

    .line 93
    if-nez v1, :cond_7

    .line 94
    .line 95
    return v2

    .line 96
    :cond_7
    iget-object v1, v0, LL0/n;->a:LL0/a;

    .line 97
    .line 98
    iget v0, v0, LL0/n;->f:F

    .line 99
    .line 100
    sub-float/2addr p1, v0

    .line 101
    iget-object v0, v1, LL0/a;->d:LM0/j;

    .line 102
    .line 103
    float-to-int p1, p1

    .line 104
    iget-object v1, v0, LM0/j;->e:Landroid/text/Layout;

    .line 105
    .line 106
    iget v0, v0, LM0/j;->g:I

    .line 107
    .line 108
    sub-int/2addr p1, v0

    .line 109
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    add-int/2addr p1, v2

    .line 114
    return p1
.end method

.method public final c(I)I
    .locals 3

    .line 1
    iget-object v0, p0, LL0/C;->b:LE/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE/a0;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LE/a0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, v0}, Ly4/b;->p(ILjava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LL0/n;

    .line 19
    .line 20
    iget-object v1, v0, LL0/n;->a:LL0/a;

    .line 21
    .line 22
    iget v2, v0, LL0/n;->d:I

    .line 23
    .line 24
    sub-int/2addr p1, v2

    .line 25
    iget-object v1, v1, LL0/a;->d:LM0/j;

    .line 26
    .line 27
    iget-object v1, v1, LM0/j;->e:Landroid/text/Layout;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget v0, v0, LL0/n;->b:I

    .line 34
    .line 35
    add-int/2addr p1, v0

    .line 36
    return p1
.end method

.method public final d(I)F
    .locals 3

    .line 1
    iget-object v0, p0, LL0/C;->b:LE/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE/a0;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LE/a0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, v0}, Ly4/b;->p(ILjava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LL0/n;

    .line 19
    .line 20
    iget-object v1, v0, LL0/n;->a:LL0/a;

    .line 21
    .line 22
    iget v2, v0, LL0/n;->d:I

    .line 23
    .line 24
    sub-int/2addr p1, v2

    .line 25
    iget-object v1, v1, LL0/a;->d:LM0/j;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, LM0/j;->f(I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v0, v0, LL0/n;->f:F

    .line 32
    .line 33
    add-float/2addr p1, v0

    .line 34
    return p1
.end method

.method public final e(I)LV0/j;
    .locals 5

    .line 1
    iget-object v0, p0, LL0/C;->b:LE/a0;

    .line 2
    .line 3
    iget-object v1, v0, LE/a0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v2, v0, LE/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LL0/l;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    iget-object v4, v2, LL0/l;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, LL0/d;

    .line 17
    .line 18
    iget-object v4, v4, LL0/d;->r:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-gt p1, v4, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    :cond_0
    if-nez v3, :cond_1

    .line 28
    .line 29
    const-string v3, "offset("

    .line 30
    .line 31
    const-string v4, ") is out of bounds [0, "

    .line 32
    .line 33
    invoke-static {v3, v4, p1}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v2, v2, LL0/l;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, LL0/d;

    .line 40
    .line 41
    iget-object v2, v2, LL0/d;->r:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v2, 0x5d

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2}, LQ0/a;->a(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v0, v0, LE/a0;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LL0/l;

    .line 65
    .line 66
    iget-object v0, v0, LL0/l;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, LL0/d;

    .line 69
    .line 70
    iget-object v0, v0, LL0/d;->r:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ne p1, v0, :cond_2

    .line 77
    .line 78
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-static {p1, v1}, Ly4/b;->o(ILjava/util/List;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, LL0/n;

    .line 92
    .line 93
    iget-object v1, v0, LL0/n;->a:LL0/a;

    .line 94
    .line 95
    invoke-virtual {v0, p1}, LL0/n;->a(I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iget-object v0, v1, LL0/a;->d:LM0/j;

    .line 100
    .line 101
    iget-object v1, v0, LM0/j;->e:Landroid/text/Layout;

    .line 102
    .line 103
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iget-object v0, v0, LM0/j;->e:Landroid/text/Layout;

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/4 v0, 0x1

    .line 114
    if-ne p1, v0, :cond_3

    .line 115
    .line 116
    sget-object p1, LV0/j;->q:LV0/j;

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_3
    sget-object p1, LV0/j;->r:LV0/j;

    .line 120
    .line 121
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, LL0/C;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, LL0/C;

    .line 10
    .line 11
    iget-object v0, p1, LL0/C;->a:LL0/B;

    .line 12
    .line 13
    iget-object v1, p0, LL0/C;->a:LL0/B;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, LL0/C;->b:LE/a0;

    .line 23
    .line 24
    iget-object v1, p1, LL0/C;->b:LE/a0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-wide v0, p0, LL0/C;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, LL0/C;->c:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, LW0/k;->a(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    iget v0, p0, LL0/C;->d:F

    .line 45
    .line 46
    iget v1, p1, LL0/C;->d:F

    .line 47
    .line 48
    cmpg-float v0, v0, v1

    .line 49
    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    iget v0, p0, LL0/C;->e:F

    .line 53
    .line 54
    iget v1, p1, LL0/C;->e:F

    .line 55
    .line 56
    cmpg-float v0, v0, v1

    .line 57
    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    iget-object v0, p0, LL0/C;->f:Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object p1, p1, LL0/C;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 74
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, LL0/C;->a:LL0/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LL0/B;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, LL0/C;->b:LE/a0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-wide v3, p0, LL0/C;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, Lk1/i;->d(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, LL0/C;->d:F

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, LL0/C;->e:F

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, LL0/C;->f:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v1, v0

    .line 43
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextLayoutResult(layoutInput="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LL0/C;->a:LL0/B;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", multiParagraph="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LL0/C;->b:LE/a0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", size="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, LL0/C;->c:J

    .line 29
    .line 30
    invoke-static {v1, v2}, LW0/k;->b(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", firstBaseline="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, LL0/C;->d:F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", lastBaseline="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v1, p0, LL0/C;->e:F

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", placeholderRects="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, LL0/C;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 v1, 0x29

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method
