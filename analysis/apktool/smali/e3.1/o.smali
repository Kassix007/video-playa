.class public final Le3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/S0;


# instance fields
.field public final q:LM5/m;

.field public final r:LP/f0;

.field public final s:LP/f0;

.field public final t:LP/C;

.field public final u:LP/C;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LM5/m;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, LM5/i0;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, LM5/i0;->I(LM5/b0;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Le3/o;->q:LM5/m;

    .line 15
    .line 16
    invoke-static {v1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Le3/o;->r:LP/f0;

    .line 21
    .line 22
    invoke-static {v1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Le3/o;->s:LP/f0;

    .line 27
    .line 28
    new-instance v0, Le3/n;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, p0, v1}, Le3/n;-><init>(Le3/o;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, LP/b;->m(LB5/a;)LP/C;

    .line 35
    .line 36
    .line 37
    new-instance v0, Le3/n;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, v1}, Le3/n;-><init>(Le3/o;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, LP/b;->m(LB5/a;)LP/C;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Le3/o;->t:LP/C;

    .line 48
    .line 49
    new-instance v0, Le3/n;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, p0, v1}, Le3/n;-><init>(Le3/o;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, LP/b;->m(LB5/a;)LP/C;

    .line 56
    .line 57
    .line 58
    new-instance v0, Le3/n;

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    invoke-direct {v0, p0, v1}, Le3/n;-><init>(Le3/o;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, LP/b;->m(LB5/a;)LP/C;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Le3/o;->u:LP/C;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le3/o;->r:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La3/k;

    .line 8
    .line 9
    return-object v0
.end method
