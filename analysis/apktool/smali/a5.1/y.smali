.class public final La5/y;
.super Landroidx/lifecycle/f0;
.source "SourceFile"


# instance fields
.field public final b:LP5/S;

.field public final c:LP5/D;

.field public final d:Landroidx/lifecycle/J;

.field public final e:Landroidx/lifecycle/J;

.field public f:Ljava/lang/String;

.field public g:La5/l;

.field public final h:LP5/S;

.field public final i:LP5/D;

.field public final j:LP5/D;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, La5/y;->b:LP5/S;

    .line 11
    .line 12
    new-instance v2, LP5/D;

    .line 13
    .line 14
    invoke-direct {v2, v1}, LP5/D;-><init>(LP5/S;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, La5/y;->c:LP5/D;

    .line 18
    .line 19
    new-instance v1, Landroidx/lifecycle/J;

    .line 20
    .line 21
    invoke-direct {v1}, Landroidx/lifecycle/G;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, La5/y;->d:Landroidx/lifecycle/J;

    .line 25
    .line 26
    iput-object v1, p0, La5/y;->e:Landroidx/lifecycle/J;

    .line 27
    .line 28
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La5/y;->h:LP5/S;

    .line 33
    .line 34
    new-instance v1, LP5/D;

    .line 35
    .line 36
    invoke-direct {v1, v0}, LP5/D;-><init>(LP5/S;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La5/y;->i:LP5/D;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, LP5/D;

    .line 51
    .line 52
    invoke-direct {v1, v0}, LP5/D;-><init>(LP5/S;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, La5/y;->j:LP5/D;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, La5/y;->b:LP5/S;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
