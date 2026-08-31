.class public final Lk2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/d;


# instance fields
.field public final q:Landroid/content/Context;

.field public final r:Ljava/lang/String;

.field public final s:LE/Y;

.field public final t:Z

.field public final u:Z

.field public final v:Lm5/o;

.field public w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LE/Y;ZZ)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk2/g;->q:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lk2/g;->r:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lk2/g;->s:LE/Y;

    .line 14
    .line 15
    iput-boolean p4, p0, Lk2/g;->t:Z

    .line 16
    .line 17
    iput-boolean p5, p0, Lk2/g;->u:Z

    .line 18
    .line 19
    new-instance p1, LA0/d;

    .line 20
    .line 21
    const/16 p2, 0x17

    .line 22
    .line 23
    invoke-direct {p1, p2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lk2/g;->v:Lm5/o;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lj2/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/g;->v:Lm5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lk2/f;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Lk2/f;->a(Z)Lj2/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/g;->v:Lm5/o;

    .line 2
    .line 3
    iget-object v0, v0, Lm5/o;->r:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lm5/v;->a:Lm5/v;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk2/g;->v:Lm5/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lk2/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lk2/f;->close()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
