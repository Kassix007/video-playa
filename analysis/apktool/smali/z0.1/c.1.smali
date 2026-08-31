.class public abstract Lz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz0/l;

.field public static final b:Lz0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz0/l;

    .line 2
    .line 3
    sget-object v1, Lz0/a;->q:Lz0/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lz0/l;-><init>(LB5/e;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lz0/c;->a:Lz0/l;

    .line 9
    .line 10
    new-instance v0, Lz0/l;

    .line 11
    .line 12
    sget-object v1, Lz0/b;->q:Lz0/b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lz0/l;-><init>(LB5/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lz0/c;->b:Lz0/l;

    .line 18
    .line 19
    return-void
.end method
