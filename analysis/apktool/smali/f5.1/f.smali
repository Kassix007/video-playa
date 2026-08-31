.class public final synthetic Lf5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:J

.field public final synthetic r:LB5/a;


# direct methods
.method public synthetic constructor <init>(JLB5/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf5/f;->q:J

    iput-object p3, p0, Lf5/f;->r:LB5/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LP/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-static {p2}, LP/b;->w(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-wide v0, p0, Lf5/f;->q:J

    .line 14
    .line 15
    iget-object v2, p0, Lf5/f;->r:LB5/a;

    .line 16
    .line 17
    invoke-static {v0, v1, v2, p1, p2}, LE3/h;->j(JLB5/a;LP/o;I)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    return-object p1
.end method
