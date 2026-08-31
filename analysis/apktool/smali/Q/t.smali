.class public final LQ/t;
.super LQ/I;
.source "SourceFile"


# static fields
.field public static final c:LQ/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LQ/t;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, LQ/I;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LQ/t;->c:LQ/t;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LQ/J;LP/c;LP/D0;LX/j;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, LQ/J;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    check-cast v1, LP/A0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p1, v2}, LQ/J;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, LP/a;

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    invoke-virtual {p1, v4}, LQ/J;->d(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, LQ/c;

    .line 21
    .line 22
    invoke-virtual {v1}, LP/A0;->i()LP/D0;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    :try_start_0
    iget-object v5, p1, LQ/c;->p:LQ/K;

    .line 27
    .line 28
    invoke-virtual {v5}, LQ/K;->U()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    const-string v5, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    .line 35
    .line 36
    invoke-static {v5}, LP/p;->c(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p1, LQ/c;->o:LQ/K;

    .line 40
    .line 41
    invoke-virtual {p1, p2, v4, p4}, LQ/K;->T(LP/c;LP/D0;LX/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v0}, LP/D0;->e(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, LP/D0;->d()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v3}, LP/A0;->d(LP/a;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p3, v1, p1}, LP/D0;->y(LP/A0;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, LP/D0;->j()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    invoke-virtual {v4, v2}, LP/D0;->e(Z)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method
