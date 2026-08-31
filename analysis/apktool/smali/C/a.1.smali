.class public final LC/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/P;


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LC/a;->b:Z

    .line 6
    .line 7
    sget-object v0, Lp3/d;->r:Lp3/d;

    .line 8
    .line 9
    iput-object v0, p0, LC/a;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, LC/a;->a:I

    .line 12
    .line 13
    return-void
.end method

.method public static d(Ljava/util/ArrayList;ILp3/Y;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p1, p2, Lp3/a0;->b:Lp3/W;

    .line 10
    .line 11
    if-eq p0, p1, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-interface {p1}, Lp3/W;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lp3/a0;

    .line 33
    .line 34
    if-ne p1, p2, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_1
    const/4 p0, -0x1

    .line 41
    return p0
.end method

.method public static f(Lp3/c;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Lp3/J;->m()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_9

    .line 11
    .line 12
    iget-object v1, p0, Lp3/J;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lp3/J;->m()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget v2, p0, Lp3/J;->a:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/16 v5, 0x7a

    .line 31
    .line 32
    const/16 v6, 0x61

    .line 33
    .line 34
    const/16 v7, 0x5a

    .line 35
    .line 36
    const/16 v8, 0x41

    .line 37
    .line 38
    if-lt v4, v8, :cond_2

    .line 39
    .line 40
    if-le v4, v7, :cond_3

    .line 41
    .line 42
    :cond_2
    if-lt v4, v6, :cond_7

    .line 43
    .line 44
    if-gt v4, v5, :cond_7

    .line 45
    .line 46
    :cond_3
    invoke-virtual {p0}, Lp3/J;->g()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_0
    if-lt v3, v8, :cond_4

    .line 51
    .line 52
    if-le v3, v7, :cond_5

    .line 53
    .line 54
    :cond_4
    if-lt v3, v6, :cond_6

    .line 55
    .line 56
    if-gt v3, v5, :cond_6

    .line 57
    .line 58
    :cond_5
    invoke-virtual {p0}, Lp3/J;->g()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget v3, p0, Lp3/J;->a:I

    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_1

    .line 70
    :cond_7
    iput v2, p0, Lp3/J;->a:I

    .line 71
    .line 72
    :goto_1
    if-nez v3, :cond_8

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_8
    :try_start_0
    invoke-static {v3}, Lp3/d;->valueOf(Ljava/lang/String;)Lp3/d;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    :catch_0
    invoke-virtual {p0}, Lp3/J;->x()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_0

    .line 87
    .line 88
    :cond_9
    :goto_2
    return-object v0
.end method

.method public static i(Lp3/m;ILjava/util/ArrayList;ILp3/Y;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lp3/m;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp3/n;

    .line 8
    .line 9
    invoke-static {v0, p4}, LC/a;->l(Lp3/n;Lp3/Y;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget v0, v0, Lp3/n;->a:I

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_3

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ltz p3, :cond_5

    .line 25
    .line 26
    add-int/lit8 p4, p1, -0x1

    .line 27
    .line 28
    invoke-static {p0, p4, p2, p3}, LC/a;->k(Lp3/m;ILjava/util/ArrayList;I)Z

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    if-eqz p4, :cond_2

    .line 33
    .line 34
    :goto_1
    return v1

    .line 35
    :cond_2
    add-int/lit8 p3, p3, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 v2, 0x2

    .line 39
    if-ne v0, v2, :cond_4

    .line 40
    .line 41
    sub-int/2addr p1, v1

    .line 42
    invoke-static {p0, p1, p2, p3}, LC/a;->k(Lp3/m;ILjava/util/ArrayList;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_4
    invoke-static {p2, p3, p4}, LC/a;->d(Ljava/util/ArrayList;ILp3/Y;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-gtz v0, :cond_6

    .line 52
    .line 53
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 54
    return p0

    .line 55
    :cond_6
    iget-object p4, p4, Lp3/a0;->b:Lp3/W;

    .line 56
    .line 57
    invoke-interface {p4}, Lp3/W;->f()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    sub-int/2addr v0, v1

    .line 62
    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    check-cast p4, Lp3/Y;

    .line 67
    .line 68
    sub-int/2addr p1, v1

    .line 69
    invoke-static {p0, p1, p2, p3, p4}, LC/a;->i(Lp3/m;ILjava/util/ArrayList;ILp3/Y;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    return p0
.end method

.method public static j(Lp3/m;Lp3/Y;)Z
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lp3/a0;->b:Lp3/W;

    .line 7
    .line 8
    :goto_0
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Lp3/a0;

    .line 15
    .line 16
    iget-object v1, v1, Lp3/a0;->b:Lp3/W;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x1

    .line 24
    sub-int/2addr v1, v3

    .line 25
    iget-object v4, p0, Lp3/m;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    move v4, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    :goto_1
    if-ne v4, v3, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Lp3/m;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lp3/n;

    .line 44
    .line 45
    invoke-static {p0, p1}, LC/a;->l(Lp3/n;Lp3/Y;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_2
    iget-object v4, p0, Lp3/m;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_2
    sub-int/2addr v2, v3

    .line 60
    invoke-static {p0, v2, v0, v1, p1}, LC/a;->i(Lp3/m;ILjava/util/ArrayList;ILp3/Y;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0
.end method

.method public static k(Lp3/m;ILjava/util/ArrayList;I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lp3/m;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp3/n;

    .line 8
    .line 9
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lp3/Y;

    .line 14
    .line 15
    invoke-static {v0, v1}, LC/a;->l(Lp3/n;Lp3/Y;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget v0, v0, Lp3/n;->a:I

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v0, v2, :cond_2

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-lez p3, :cond_4

    .line 31
    .line 32
    add-int/lit8 v0, p1, -0x1

    .line 33
    .line 34
    add-int/lit8 p3, p3, -0x1

    .line 35
    .line 36
    invoke-static {p0, v0, p2, p3}, LC/a;->k(Lp3/m;ILjava/util/ArrayList;I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    :goto_0
    return v2

    .line 43
    :cond_2
    const/4 v3, 0x2

    .line 44
    if-ne v0, v3, :cond_3

    .line 45
    .line 46
    sub-int/2addr p1, v2

    .line 47
    sub-int/2addr p3, v2

    .line 48
    invoke-static {p0, p1, p2, p3}, LC/a;->k(Lp3/m;ILjava/util/ArrayList;I)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_3
    invoke-static {p2, p3, v1}, LC/a;->d(Ljava/util/ArrayList;ILp3/Y;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-gtz v0, :cond_5

    .line 58
    .line 59
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_5
    iget-object v1, v1, Lp3/a0;->b:Lp3/W;

    .line 62
    .line 63
    invoke-interface {v1}, Lp3/W;->f()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sub-int/2addr v0, v2

    .line 68
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lp3/Y;

    .line 73
    .line 74
    sub-int/2addr p1, v2

    .line 75
    invoke-static {p0, p1, p2, p3, v0}, LC/a;->i(Lp3/m;ILjava/util/ArrayList;ILp3/Y;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0
.end method

.method public static l(Lp3/n;Lp3/Y;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lp3/n;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lp3/a0;->o()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lp3/n;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    if-eqz v0, :cond_5

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    move v3, v1

    .line 32
    :cond_1
    if-ge v3, v2, :cond_5

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    check-cast v4, Lp3/b;

    .line 41
    .line 42
    iget-object v5, v4, Lp3/b;->a:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v4, Lp3/b;->c:Ljava/lang/String;

    .line 45
    .line 46
    const-string v6, "id"

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_4

    .line 53
    .line 54
    const-string v6, "class"

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object v5, p1, Lp3/Y;->g:Ljava/util/ArrayList;

    .line 64
    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iget-object v5, p1, Lp3/Y;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    iget-object p0, p0, Lp3/n;->d:Ljava/util/ArrayList;

    .line 85
    .line 86
    if-eqz p0, :cond_7

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    move v2, v1

    .line 93
    :cond_6
    if-ge v2, v0, :cond_7

    .line 94
    .line 95
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    check-cast v3, Lp3/e;

    .line 102
    .line 103
    invoke-interface {v3, p1}, Lp3/e;->a(Lp3/Y;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_6

    .line 108
    .line 109
    :goto_0
    return v1

    .line 110
    :cond_7
    const/4 p0, 0x1

    .line 111
    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LC/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LC/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarContextView;->v:Lw1/O;

    .line 12
    .line 13
    iget v1, p0, LC/a;->a:I

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->b(Landroidx/appcompat/widget/ActionBarContextView;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC/a;->b:Z

    .line 3
    .line 4
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, LC/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Landroidx/appcompat/widget/ActionBarContextView;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, LC/a;->b:Z

    .line 10
    .line 11
    return-void
.end method

.method public e(LF3/c;Lp3/c;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Lp3/c;->B()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lp3/J;->y()V

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_1e

    .line 9
    .line 10
    iget-boolean v1, p0, LC/a;->b:Z

    .line 11
    .line 12
    const-string v2, "Invalid @media rule: expected \'}\' at end of rule set"

    .line 13
    .line 14
    const/16 v3, 0x7d

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/16 v5, 0x7b

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v1, :cond_5

    .line 21
    .line 22
    const-string v1, "media"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_5

    .line 29
    .line 30
    invoke-static {p2}, LC/a;->f(Lp3/c;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p2, v5}, Lp3/J;->j(C)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {p2}, Lp3/J;->y()V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, LC/a;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lp3/d;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    move v7, v4

    .line 52
    :cond_0
    if-ge v7, v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    add-int/lit8 v7, v7, 0x1

    .line 59
    .line 60
    check-cast v8, Lp3/d;

    .line 61
    .line 62
    sget-object v9, Lp3/d;->q:Lp3/d;

    .line 63
    .line 64
    if-eq v8, v9, :cond_1

    .line 65
    .line 66
    if-ne v8, v1, :cond_0

    .line 67
    .line 68
    :cond_1
    iput-boolean v6, p0, LC/a;->b:Z

    .line 69
    .line 70
    invoke-virtual {p0, p2}, LC/a;->h(Lp3/c;)LF3/c;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, LF3/c;->b(LF3/c;)V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, LC/a;->b:Z

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {p0, p2}, LC/a;->h(Lp3/c;)LF3/c;

    .line 81
    .line 82
    .line 83
    :goto_0
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_1d

    .line 88
    .line 89
    invoke-virtual {p2, v3}, Lp3/J;->j(C)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_3
    new-instance p1, Lp3/a;

    .line 98
    .line 99
    invoke-direct {p1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_4
    new-instance p1, Lp3/a;

    .line 104
    .line 105
    const-string p2, "Invalid @media rule: missing rule set"

    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_5
    iget-boolean p1, p0, LC/a;->b:Z

    .line 112
    .line 113
    const/16 v1, 0x3b

    .line 114
    .line 115
    if-nez p1, :cond_19

    .line 116
    .line 117
    const-string p1, "import"

    .line 118
    .line 119
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_19

    .line 124
    .line 125
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    const/4 v0, 0x0

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    goto/16 :goto_7

    .line 133
    .line 134
    :cond_6
    iget p1, p2, Lp3/J;->a:I

    .line 135
    .line 136
    const-string v3, "url("

    .line 137
    .line 138
    invoke-virtual {p2, v3}, Lp3/J;->k(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-nez v3, :cond_7

    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :cond_7
    invoke-virtual {p2}, Lp3/J;->y()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Lp3/c;->A()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-nez v3, :cond_12

    .line 154
    .line 155
    iget-object v3, p2, Lp3/J;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v3, Ljava/lang/String;

    .line 158
    .line 159
    new-instance v4, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    :cond_8
    :goto_1
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-nez v5, :cond_10

    .line 169
    .line 170
    iget v5, p2, Lp3/J;->a:I

    .line 171
    .line 172
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    const/16 v7, 0x27

    .line 177
    .line 178
    if-eq v5, v7, :cond_10

    .line 179
    .line 180
    const/16 v7, 0x22

    .line 181
    .line 182
    if-eq v5, v7, :cond_10

    .line 183
    .line 184
    const/16 v7, 0x28

    .line 185
    .line 186
    if-eq v5, v7, :cond_10

    .line 187
    .line 188
    const/16 v7, 0x29

    .line 189
    .line 190
    if-eq v5, v7, :cond_10

    .line 191
    .line 192
    invoke-static {v5}, Lp3/J;->o(I)Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-nez v7, :cond_10

    .line 197
    .line 198
    invoke-static {v5}, Ljava/lang/Character;->isISOControl(I)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-eqz v7, :cond_9

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_9
    iget v7, p2, Lp3/J;->a:I

    .line 206
    .line 207
    add-int/2addr v7, v6

    .line 208
    iput v7, p2, Lp3/J;->a:I

    .line 209
    .line 210
    const/16 v7, 0x5c

    .line 211
    .line 212
    if-ne v5, v7, :cond_f

    .line 213
    .line 214
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_a

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_a
    iget v5, p2, Lp3/J;->a:I

    .line 222
    .line 223
    add-int/lit8 v7, v5, 0x1

    .line 224
    .line 225
    iput v7, p2, Lp3/J;->a:I

    .line 226
    .line 227
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    const/16 v7, 0xa

    .line 232
    .line 233
    if-eq v5, v7, :cond_8

    .line 234
    .line 235
    const/16 v7, 0xd

    .line 236
    .line 237
    if-eq v5, v7, :cond_8

    .line 238
    .line 239
    const/16 v7, 0xc

    .line 240
    .line 241
    if-ne v5, v7, :cond_b

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_b
    invoke-static {v5}, Lp3/c;->z(I)I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    const/4 v8, -0x1

    .line 249
    if-eq v7, v8, :cond_f

    .line 250
    .line 251
    move v5, v6

    .line 252
    :goto_2
    const/4 v9, 0x5

    .line 253
    if-gt v5, v9, :cond_e

    .line 254
    .line 255
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_c

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_c
    iget v9, p2, Lp3/J;->a:I

    .line 263
    .line 264
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    invoke-static {v9}, Lp3/c;->z(I)I

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-ne v9, v8, :cond_d

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_d
    iget v10, p2, Lp3/J;->a:I

    .line 276
    .line 277
    add-int/2addr v10, v6

    .line 278
    iput v10, p2, Lp3/J;->a:I

    .line 279
    .line 280
    mul-int/lit8 v7, v7, 0x10

    .line 281
    .line 282
    add-int/2addr v7, v9

    .line 283
    add-int/lit8 v5, v5, 0x1

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_e
    :goto_3
    int-to-char v5, v7

    .line 287
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_f
    int-to-char v5, v5

    .line 292
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_10
    :goto_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_11

    .line 302
    .line 303
    move-object v3, v0

    .line 304
    goto :goto_5

    .line 305
    :cond_11
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    :cond_12
    :goto_5
    if-nez v3, :cond_13

    .line 310
    .line 311
    iput p1, p2, Lp3/J;->a:I

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_13
    invoke-virtual {p2}, Lp3/J;->y()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-nez v4, :cond_15

    .line 322
    .line 323
    const-string v4, ")"

    .line 324
    .line 325
    invoke-virtual {p2, v4}, Lp3/J;->k(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    if-eqz v4, :cond_14

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_14
    iput p1, p2, Lp3/J;->a:I

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_15
    :goto_6
    move-object v0, v3

    .line 336
    :goto_7
    if-nez v0, :cond_16

    .line 337
    .line 338
    invoke-virtual {p2}, Lp3/c;->A()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    :cond_16
    if-eqz v0, :cond_18

    .line 343
    .line 344
    invoke-virtual {p2}, Lp3/J;->y()V

    .line 345
    .line 346
    .line 347
    invoke-static {p2}, LC/a;->f(Lp3/c;)Ljava/util/ArrayList;

    .line 348
    .line 349
    .line 350
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    if-nez p1, :cond_1d

    .line 355
    .line 356
    invoke-virtual {p2, v1}, Lp3/J;->j(C)Z

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-eqz p1, :cond_17

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_17
    new-instance p1, Lp3/a;

    .line 364
    .line 365
    invoke-direct {p1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw p1

    .line 369
    :cond_18
    new-instance p1, Lp3/a;

    .line 370
    .line 371
    const-string p2, "Invalid @import rule: expected string or url()"

    .line 372
    .line 373
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw p1

    .line 377
    :cond_19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v2, "Ignoring @"

    .line 380
    .line 381
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v0, " rule"

    .line 388
    .line 389
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    const-string v0, "CSSParser"

    .line 397
    .line 398
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    :cond_1a
    :goto_8
    invoke-virtual {p2}, Lp3/J;->m()Z

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    if-nez p1, :cond_1d

    .line 406
    .line 407
    invoke-virtual {p2}, Lp3/J;->p()Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    if-ne p1, v1, :cond_1b

    .line 416
    .line 417
    if-nez v4, :cond_1b

    .line 418
    .line 419
    goto :goto_9

    .line 420
    :cond_1b
    if-ne p1, v5, :cond_1c

    .line 421
    .line 422
    add-int/lit8 v4, v4, 0x1

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_1c
    if-ne p1, v3, :cond_1a

    .line 426
    .line 427
    if-lez v4, :cond_1a

    .line 428
    .line 429
    add-int/lit8 v4, v4, -0x1

    .line 430
    .line 431
    if-nez v4, :cond_1a

    .line 432
    .line 433
    :cond_1d
    :goto_9
    invoke-virtual {p2}, Lp3/J;->y()V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_1e
    new-instance p1, Lp3/a;

    .line 438
    .line 439
    const-string p2, "Invalid \'@\' rule"

    .line 440
    .line 441
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw p1
.end method

.method public g(LF3/c;Lp3/c;)Z
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual {v0}, Lp3/c;->C()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_d

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_d

    .line 15
    .line 16
    const/16 v3, 0x7b

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Lp3/J;->j(C)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_c

    .line 23
    .line 24
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lp3/S;

    .line 28
    .line 29
    invoke-direct {v3}, Lp3/S;-><init>()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, Lp3/c;->B()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 37
    .line 38
    .line 39
    const/16 v5, 0x3a

    .line 40
    .line 41
    invoke-virtual {v0, v5}, Lp3/J;->j(C)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_b

    .line 46
    .line 47
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 48
    .line 49
    .line 50
    iget-object v5, v0, Lp3/J;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0}, Lp3/J;->m()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/4 v7, 0x1

    .line 59
    const/16 v8, 0x21

    .line 60
    .line 61
    const/16 v9, 0x7d

    .line 62
    .line 63
    const/16 v10, 0x3b

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    iget v6, v0, Lp3/J;->a:I

    .line 70
    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    move v13, v6

    .line 76
    :goto_0
    const/4 v14, -0x1

    .line 77
    if-eq v12, v14, :cond_4

    .line 78
    .line 79
    if-eq v12, v10, :cond_4

    .line 80
    .line 81
    if-eq v12, v9, :cond_4

    .line 82
    .line 83
    if-eq v12, v8, :cond_4

    .line 84
    .line 85
    const/16 v14, 0xa

    .line 86
    .line 87
    if-eq v12, v14, :cond_4

    .line 88
    .line 89
    const/16 v14, 0xd

    .line 90
    .line 91
    if-ne v12, v14, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-static {v12}, Lp3/J;->o(I)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    if-nez v12, :cond_3

    .line 99
    .line 100
    iget v12, v0, Lp3/J;->a:I

    .line 101
    .line 102
    add-int/lit8 v13, v12, 0x1

    .line 103
    .line 104
    :cond_3
    invoke-virtual {v0}, Lp3/J;->g()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    goto :goto_0

    .line 109
    :cond_4
    :goto_1
    iget v12, v0, Lp3/J;->a:I

    .line 110
    .line 111
    if-le v12, v6, :cond_5

    .line 112
    .line 113
    invoke-virtual {v5, v6, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    iput v6, v0, Lp3/J;->a:I

    .line 119
    .line 120
    :goto_2
    if-eqz v11, :cond_a

    .line 121
    .line 122
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v8}, Lp3/J;->j(C)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_7

    .line 130
    .line 131
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 132
    .line 133
    .line 134
    const-string v5, "important"

    .line 135
    .line 136
    invoke-virtual {v0, v5}, Lp3/J;->k(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_6

    .line 141
    .line 142
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    new-instance v0, Lp3/a;

    .line 147
    .line 148
    const-string v1, "Malformed rule set: found unexpected \'!\'"

    .line 149
    .line 150
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_7
    :goto_3
    invoke-virtual {v0, v10}, Lp3/J;->j(C)Z

    .line 155
    .line 156
    .line 157
    invoke-static {v3, v4, v11}, Lp3/J0;->D(Lp3/S;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lp3/J;->m()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-nez v4, :cond_8

    .line 168
    .line 169
    invoke-virtual {v0, v9}, Lp3/J;->j(C)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-eqz v4, :cond_0

    .line 174
    .line 175
    :cond_8
    invoke-virtual {v0}, Lp3/J;->y()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    :goto_4
    if-ge v2, v0, :cond_9

    .line 183
    .line 184
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    add-int/lit8 v2, v2, 0x1

    .line 189
    .line 190
    check-cast v4, Lp3/m;

    .line 191
    .line 192
    new-instance v5, Lp3/l;

    .line 193
    .line 194
    iget v6, p0, LC/a;->a:I

    .line 195
    .line 196
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    iput-object v4, v5, Lp3/l;->a:Lp3/m;

    .line 200
    .line 201
    iput-object v3, v5, Lp3/l;->b:Lp3/S;

    .line 202
    .line 203
    iput v6, v5, Lp3/l;->c:I

    .line 204
    .line 205
    move-object/from16 v4, p1

    .line 206
    .line 207
    invoke-virtual {v4, v5}, LF3/c;->a(Lp3/l;)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_9
    return v7

    .line 212
    :cond_a
    new-instance v0, Lp3/a;

    .line 213
    .line 214
    const-string v1, "Expected property value"

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :cond_b
    new-instance v0, Lp3/a;

    .line 221
    .line 222
    const-string v1, "Expected \':\'"

    .line 223
    .line 224
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :cond_c
    new-instance v0, Lp3/a;

    .line 229
    .line 230
    const-string v1, "Malformed rule block: expected \'{\'"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_d
    return v2
.end method

.method public h(Lp3/c;)LF3/c;
    .locals 3

    .line 1
    new-instance v0, LF3/c;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LF3/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lp3/J;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    const-string v1, "<!--"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lp3/J;->k(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v1, "-->"

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lp3/J;->k(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/16 v1, 0x40

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lp3/J;->j(C)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v0, p1}, LC/a;->e(LF3/c;Lp3/c;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {p0, v0, p1}, LC/a;->g(LF3/c;Lp3/c;)Z

    .line 46
    .line 47
    .line 48
    move-result v1
    :try_end_0
    .catch Lp3/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-object v0

    .line 53
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "CSS parser terminated early due to error: "

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v1, "CSSParser"

    .line 72
    .line 73
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    return-object v0
.end method
