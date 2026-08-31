.class public final LM/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL/n;


# static fields
.field public static final a:LM/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LM/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LM/l;->a:LM/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LP/o;)LL/g;
    .locals 1

    .line 1
    const v0, -0x1157ee36

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, LP/o;->p(Z)V

    .line 9
    .line 10
    .line 11
    sget-object p1, LM/s0;->a:LL/g;

    .line 12
    .line 13
    return-object p1
.end method

.method public final b(LP/o;)J
    .locals 3

    .line 1
    const v0, -0x6df157d1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, LM/q;->a:LP/z;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lj0/o;

    .line 14
    .line 15
    iget-wide v0, v0, Lj0/o;->a:J

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p1, v2}, LP/o;->p(Z)V

    .line 19
    .line 20
    .line 21
    return-wide v0
.end method
