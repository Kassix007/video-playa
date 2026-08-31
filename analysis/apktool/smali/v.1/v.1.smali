.class public final Lv/v;
.super LB0/n;
.source "SourceFile"


# instance fields
.field public G:Lv/q;

.field public H:F

.field public I:Lj0/G;

.field public J:LH/d;

.field public final K:Lg0/b;


# direct methods
.method public constructor <init>(FLj0/G;LH/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LB0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv/v;->H:F

    .line 5
    .line 6
    iput-object p2, p0, Lv/v;->I:Lj0/G;

    .line 7
    .line 8
    iput-object p3, p0, Lv/v;->J:LH/d;

    .line 9
    .line 10
    new-instance p1, Lm0/a;

    .line 11
    .line 12
    const/4 p2, 0x6

    .line 13
    invoke-direct {p1, p2, p0}, Lm0/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lg0/b;

    .line 17
    .line 18
    new-instance p3, Lg0/c;

    .line 19
    .line 20
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lg0/e;->q:Lg0/e;

    .line 24
    .line 25
    iput-object v0, p3, Lg0/c;->q:Lg0/a;

    .line 26
    .line 27
    invoke-direct {p2, p3, p1}, Lg0/b;-><init>(Lg0/c;Lm0/a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p2}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lv/v;->K:Lg0/b;

    .line 34
    .line 35
    return-void
.end method
