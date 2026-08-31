.class public final Lv/J;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/E0;


# static fields
.field public static final F:Lv/M;


# instance fields
.field public E:Lm0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv/M;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lv/M;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv/J;->F:Lv/M;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final o()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lv/J;->F:Lv/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x0(Lz0/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv/J;->E:Lm0/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lv/J;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lv/J;->x0(Lz0/m;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
